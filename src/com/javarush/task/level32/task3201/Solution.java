package com.javarush.task.task32.task3201;


import java.io.RandomAccessFile;

/*
Запись в существующий файл
*/
public class Solution {
    public static void main(String... args) throws Exception {
        String fileName = args[0];
        int number = Integer.parseInt(args[1]);
        String text = args[2];

        RandomAccessFile raf = new RandomAccessFile(fileName, "w");
        raf.seek(number>raf.length()?raf.length() : number);
        raf.write(text.getBytes());
        raf.close();
    }
}
