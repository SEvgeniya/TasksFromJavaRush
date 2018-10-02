package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String s = read.readLine();
        FileInputStream inputStream = new FileInputStream(s);
        read.close();
        int count = 0;
        while (inputStream.available()>0) {
            int data = inputStream.read();
            if (data == 44) {
                count++;
            }
        }
        System.out.println(count);
        inputStream.close();
    }
}
