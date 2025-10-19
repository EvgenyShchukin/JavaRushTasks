package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static com.javarush.task.task30.task3008.ConsoleHelper.*;

public class Server {
    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();

    public static void sendBroadcastMessage(Message message) {
        for (Connection connection : connectionMap.values()) {
            try {
                connection.send(message);
            } catch (IOException e) {
                writeMessage("Не смогли отправить сообщение " + connection.getRemoteSocketAddress());
            }
        }
    }

    public static void main(String[] args) {
        writeMessage("Введите порт сервера");
        int port = readInt();

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            writeMessage("Сервер запущен");
            while (true) {
                Socket socket = serverSocket.accept();
                Handler handler = new Handler(socket);
                handler.start();
            }

        } catch (IOException e) {
            writeMessage("Произошла ошибка при работе сервера");
        }

    }


    private static class Handler extends Thread {
        private Socket socket;

        private Handler(Socket socket) {
            this.socket = socket;
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {
            connection.send(new Message(MessageType.NAME_REQUEST, "Введите ваше имя"));
            Message message = connection.receive();
            String name = message.getData();

            if (message.getType() == MessageType.USER_NAME
                && name != null
                && !name.isEmpty()
                && !connectionMap.containsKey(name)) {
                connectionMap.put(name, connection);
                connection.send(new Message(MessageType.NAME_ACCEPTED, "Добро пожаловать в чат " + name));
                return name;
            } else {
                writeMessage("Ошибка ввода имени");
                return serverHandshake(connection);
            }
        }

        private void notifyUsers(Connection connection, String userName) throws IOException {
            for (String name : connectionMap.keySet()) {
                if (!name.equals(userName)) {
                    connection.send(new Message(MessageType.USER_ADDED, name));
                }
            }
        }

        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException {
            while (true) {
                Message message = connection.receive();
                if (message.getType() == MessageType.TEXT) {
                    sendBroadcastMessage(new Message(MessageType.TEXT, userName + ": " + message.getData()));
                } else {
                    writeMessage("Неверный тип сообщения");
                }
            }
        }

        @Override
        public void run() {
            writeMessage("Установлено новое соединение с удаленным адресом " + socket.getRemoteSocketAddress());
            String userName = null;
            try (Connection connection = new Connection(socket)) {
                userName = serverHandshake(connection);
                sendBroadcastMessage(new Message(MessageType.USER_ADDED, userName));
                notifyUsers(connection, userName);
                serverMainLoop(connection, userName);
            } catch (IOException | ClassNotFoundException e) {
                writeMessage("Произошла ошибка при обмене данными с удаленным адресом " + socket.getRemoteSocketAddress());
            }
            if (userName != null) {
                connectionMap.remove(userName);
                sendBroadcastMessage(new Message(MessageType.USER_REMOVED, userName));
            }

            writeMessage("Соединение было закрыто с " + socket.getRemoteSocketAddress());
        }
    }
}
