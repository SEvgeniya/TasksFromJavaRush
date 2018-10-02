package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String readBuf;
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        readBuf = buf.readLine();

        try {
            FileInputStream fileInputStream = new FileInputStream(readBuf);

            while (fileInputStream.available() > 0) {
                System.out.print((char)fileInputStream.read());
            }

            System.out.println();

            fileInputStream.close();
            buf.close();

        } catch (FileNotFoundException e) {
            System.out.println("Такой файл не найден!");
        }



    }
}