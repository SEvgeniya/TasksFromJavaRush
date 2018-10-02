package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> spisok = new ArrayList<>();
        for (int i = 0; ; i++) {
            {
                spisok.add(reader.readLine());
            }
            if (spisok.get(i).equals("end"))
                break;
        }
        spisok.remove("end");
        for (int i = 0; i < spisok.size(); i++) {
            System.out.println(spisok.get(i));
        }
    }
}