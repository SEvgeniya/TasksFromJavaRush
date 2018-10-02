package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        FileInputStream fis = new FileInputStream(file1);
        byte[] buf1 = new byte[fis.available()];
        fis.read(buf1);
        fis.close();
        FileOutputStream ous = new FileOutputStream(file1);
        FileInputStream fis2 = new FileInputStream(file2);
        byte[] buf2 = new byte[fis2.available()];
        fis2.read(buf2);
        fis2.close();

        ous.write(buf2);
        ous.write(buf1);

        ous.close();
    }
}
