package com.javarush.task.task30.task3008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }
    public static String readString() {
        String str;
        while (true) {
            try {
                str = reader.readLine();
                break;
            } catch (IOException e) {
                System.out.println("Произошла ошибка при попытке ввода текста. Попробуйте еще раз.");
            }
        }
        return str;
    }
    public static int readInt() throws IOException {
        int i;
        try {
            i = Integer.parseInt(readString());
        }
        catch (NumberFormatException nfe) {
            System.out.println("Произошла ошибка при попытке ввода числа. Попробуйте еще раз.");
            i = Integer.parseInt(readString());
        }
        return i;
    }
}
