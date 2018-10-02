package com.javarush.task.task32.task3210;

import java.io.IOException;
import java.io.RandomAccessFile;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) throws Exception {
        String fileName = args[0];
        int number = Integer.parseInt(args[1]);
        String text = args[2];

        try (RandomAccessFile raf = new RandomAccessFile(fileName, "rw")) {
            byte[] buf = new byte[text.length()];
            raf.seek(number);
            raf.read(buf, 0, buf.length);
            String line = new String(buf);
            String writeToFile = line.equals(text) ? "true" : "false";
            raf.seek(raf.length());
            raf.write(writeToFile.getBytes());
        }
    }
}
