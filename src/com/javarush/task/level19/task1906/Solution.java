package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String file1 = read.readLine();
        String file2 = read.readLine();
        read.close();

        FileReader reader = new FileReader(file1);
        FileWriter writer = new FileWriter(file2);
        int count = 0;
        while (reader.ready()) {
            int data = reader.read();
            count++;
            if (count%2==0) {
                writer.write(data);
            }
        }
        reader.close();
        writer.close();
    }
}
