package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String s1 = read.readLine();
        String s2 = read.readLine();
        String s3 = read.readLine();
        FileOutputStream outputStream = new FileOutputStream(s1);
        FileInputStream inputStream2 = new FileInputStream(s2);
        FileInputStream inputStream3 = new FileInputStream(s3);

        while (inputStream2.available()>0) {
            int data2 = inputStream2.read();
            outputStream.write(data2);
        }
        outputStream.close();
        inputStream2.close();

        outputStream = new FileOutputStream(new File(s1), true);
        while (inputStream3.available()>0) {
            int data3 = inputStream3.read();
            outputStream.write(data3);
        }
        outputStream.close();
        inputStream3.close();
    }
}
