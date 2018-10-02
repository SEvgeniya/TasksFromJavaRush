package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();

        String result = outputStream.toString();

        System.setOut(consoleStream);

        //StringBuilder sb = new StringBuilder(result);
        String[] arr = result.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[2]);
        if (arr[1].equals("+")) {
            int c = a+b;
            System.out.print(result + c);
        }
        else if (arr[1].equals("-")) {
            int c = a-b;
            System.out.print(result + c);
        }
        else if (arr[1].equals("*")) {
            int c = a*b;
            System.out.print(result + c);
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.print("3 + 6 = ");
        }
    }
}

