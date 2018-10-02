package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String file1 = read.readLine();
        String file2 = read.readLine();
        read.close();

        FileInputStream inputStream = new FileInputStream(file1);
        ArrayList<Integer> list = new ArrayList<>();
        FileOutputStream outputStream = new FileOutputStream(file2);
        while (inputStream.available()>0) {
            int data = inputStream.read();
            list.add(data);
        }
        for (int i = list.size()-1; i >= 0; i --) {
            outputStream.write(list.get(i));
        }
        inputStream.close();
        outputStream.close();
    }
}
