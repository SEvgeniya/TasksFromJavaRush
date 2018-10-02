package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.ConsoleHelper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;

public class BotClient extends Client {
    public class BotSocketThread extends SocketThread {
        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            BotClient.this.sendTextMessage("Привет чатику. Я бот. Понимаю команды: дата, день, месяц, год, время, час, минуты, секунды.");
            super.clientMainLoop();
        }

        @Override
        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);
            String senderName = "";
            String senderText;
            if (message.contains(": ")) {
                senderName = message.substring(0, message.indexOf(": "));
                senderText = message.substring(message.indexOf(": ") + 2);
            } else senderText = message;

            SimpleDateFormat simpleDateFormat = null;

            HashMap<String, String> formats = new HashMap<String, String>() {
                {
                    put("дата", "d.MM.YYYY");
                    put("день", "d");
                    put("месяц", "MMMM");
                    put("год", "YYYY");
                    put("время", "H:mm:ss");
                    put("час", "H");
                    put("минуты", "m");
                    put("секунды", "s");
                }
            };
            for (HashMap.Entry<String, String> pair : formats.entrySet()) {
                if (senderText.equals(pair.getKey())) {
                    simpleDateFormat = new SimpleDateFormat(pair.getValue());
                }
            }
            if (simpleDateFormat!=null) {
                sendTextMessage("Информация для " + senderName + ": " + simpleDateFormat.format(Calendar.getInstance().getTime()));
            }
        }
    }

    public static void main(String[] args) {
        BotClient botClient = new BotClient();
        botClient.run();
    }

    @Override
    protected String getUserName() {
        String botName = "";
        int x = (int) (Math.random() * 100);
        botName = "date_bot_".concat(String.valueOf(x));
        return botName;
    }

    @Override
    protected boolean shouldSendTextFromConsole() {
        return false;
    }

    @Override
    protected SocketThread getSocketThread() {
        return new BotSocketThread();
    }
}
