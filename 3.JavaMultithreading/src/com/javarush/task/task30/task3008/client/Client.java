package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.Connection;
import com.javarush.task.task30.task3008.Message;
import com.javarush.task.task30.task3008.MessageType;

import java.io.IOException;
import java.net.Socket;

import static com.javarush.task.task30.task3008.ConsoleHelper.*;
import static com.javarush.task.task30.task3008.MessageType.*;

public class Client {
    protected Connection connection;
    private volatile boolean clientConnected = false;

    protected String getServerAddress() {
        writeMessage("Введите адрес сервера");
        return readString();
    }

    protected int getServerPort() {
        writeMessage("Введите порт сервера");
        return readInt();
    }

    protected String getUserName() {
        writeMessage("Введите имя пользователя");
        return readString();
    }

    protected boolean shouldSendTextFromConsole() {
        return true;
    }

    protected SocketThread getSocketThread() {
        return new SocketThread();
    }

    protected void sendTextMessage(String text) {
        try {
            connection.send(new Message(MessageType.TEXT, text));
        } catch (IOException e) {
            writeMessage("Не удалось отправить сообщение");
            clientConnected = false;
        }
    }

    public void run() {
        SocketThread socketThread = getSocketThread();
        socketThread.setDaemon(true);
        socketThread.start();

        try {
            synchronized (this) {
                this.wait();
            }
        } catch (InterruptedException e) {
            writeMessage("Произошла ошибка  во время ожидания клиента");
            return;
        }

        if (clientConnected) {
            writeMessage("Соединение установлено. Для выхода наберите команду 'exit'.");
            while (clientConnected) {
                String text = readString();
                if (text.equals("exit")) {
                    break;
                }

                if (shouldSendTextFromConsole()) {
                    sendTextMessage(text);
                }
            }
        } else {
            writeMessage("Произошла ошибка во время работы клиента.");
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }

    public class SocketThread extends Thread {

        protected void processIncomingMessage(String message) {
            writeMessage(message);
        }

        protected void informAboutAddingNewUser(String userName) {
            writeMessage("Участник " + userName + " присоединился к чату");
        }

        protected void informAboutDeletingNewUser(String userName) {
            writeMessage("Участник " + userName + " покинул чат");
        }

        protected void notifyConnectionStatusChanged(boolean clientConnected) {
            Client.this.clientConnected = clientConnected;
            synchronized (Client.this) {
                Client.this.notify();
            }
        }

        protected void clientHandshake() throws IOException, ClassNotFoundException {
            while (true) {
                Message message = connection.receive();
                if (message.getType() == NAME_REQUEST) {
                    String userName = getUserName();
                    connection.send(new Message(USER_NAME, userName));
                } else if (message.getType() == NAME_ACCEPTED) {
                    notifyConnectionStatusChanged(true);
                    return;
                } else {
                    throw new IOException("Unexpected MessageType");
                }
            }
        }

        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            while (true) {

                Message message = connection.receive();

                if (message.getType() == TEXT) {
                    processIncomingMessage(message.getData());
                } else if (message.getType() == USER_ADDED) {
                    informAboutAddingNewUser(message.getData());
                } else if (message.getType() == USER_REMOVED) {
                    informAboutDeletingNewUser(message.getData());
                } else {
                    throw new IOException("Unexpected MessageType");
                }
            }
        }

        @Override
        public void run() {
            String address = getServerAddress();
            int port = getServerPort();

            try (Socket socket = new Socket(address, port)) {
                connection = new Connection(socket);
                clientHandshake();
                clientMainLoop();
            } catch (IOException | ClassNotFoundException e) {
                notifyConnectionStatusChanged(false);
            }

        }
    }
}
