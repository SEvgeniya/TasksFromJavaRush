package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        int count = 0;
        ArrayList<String> list = new ArrayList<>();
        while (inputStream.available()>0) {
            list.add(String.valueOf((char)(inputStream.read())));
        }
        for (String s : list) {
            if (s.matches("[a-z]")||s.matches("[A-Z]")) {
                count++;
            }
        }
        inputStream.close();
        System.out.println(count);
    }
}
