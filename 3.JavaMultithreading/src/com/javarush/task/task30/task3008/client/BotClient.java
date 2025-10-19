package com.javarush.task.task30.task3008.client;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import static com.javarush.task.task30.task3008.ConsoleHelper.*;

public class BotClient extends Client {

    @Override
    protected SocketThread getSocketThread() {
        return new BotSocketThread();
    }

    @Override
    protected boolean shouldSendTextFromConsole() {
        return false;
    }

    @Override
    protected String getUserName() {
        return "date_bot_" + (int) (Math.random() * 100);
    }

    public static void main(String[] args) {
        BotClient botClient = new BotClient();
        botClient.run();
    }

    public class BotSocketThread extends SocketThread {
        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            sendTextMessage("Привет чатику. Я бот. Понимаю команды: дата, день, месяц, год, время, час, минуты, секунды.");
            super.clientMainLoop();
        }

        @Override
        protected void processIncomingMessage(String message) {
            writeMessage(message);

            if (message.contains(": ")) {
                String[] strings = message.split(": ");
                String name = strings[0];
                String text = strings[1];

                String format;
                switch (text) {
                    case "дата":
                        format = "d.MM.YYYY";
                        break;
                    case "день":
                        format = "d";
                        break;
                    case "месяц":
                        format = "MMMM";
                        break;
                    case "год":
                        format = "YYYY";
                        break;
                    case "время":
                        format = "H:mm:ss";
                        break;
                    case "час":
                        format = "H";
                        break;
                    case "минуты":
                        format = "m";
                        break;
                    case "секунды":
                        format = "s";
                        break;
                    default:
                        format = null;
                        break;
                }

                if (format != null) {
                    String pattern = new SimpleDateFormat(format).format(new GregorianCalendar().getTime());
                    // sendTextMessage("Информация для " + name + ": " + pattern);
                    sendTextMessage(String.format("Информация для %s: %s", name, pattern));
                    // sendTextMessage("Информация для %s: %s".formatted(name, pattern));
                }
            }
        }
    }
}
