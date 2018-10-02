package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String file1 = read.readLine();
        String file2 = read.readLine();
        String file3 = read.readLine();
        read.close();
        ArrayList<Integer> list = new ArrayList<>();

        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream1 = new FileOutputStream(file2);
        FileOutputStream outputStream2 = new FileOutputStream(file3);
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            list.add(data);
        }

        if (list.size() % 2 == 0) {
            for (int i = 0; i < list.size()/2; i ++) {
                outputStream1.write(list.get(i));
            }
            for (int i = list.size()/2; i < list.size(); i ++) {
                outputStream2.write(list.get(i));
            }
        }
        else {
            for (int i = 0; i < list.size()/2+1; i ++) {
                outputStream1.write(list.get(i));
            }
            for (int i = list.size()/2+1; i < list.size(); i ++) {
                outputStream2.write(list.get(i));
            }
        }
        inputStream.close();
        outputStream1.close();
        outputStream2.close();
    }
}
