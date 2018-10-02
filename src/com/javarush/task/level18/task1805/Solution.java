package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String s = read.readLine();
        FileInputStream inputStream = new FileInputStream(s);
        read.close();
        ArrayList<Integer> list = new ArrayList<>();

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            list.add(data);
        }
        Collections.sort(list);

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                list.remove(i);
                i--;
            }
        }
        inputStream.close();
        for (Integer q : list) {
            System.out.print(q + " ");
        }
    }
}