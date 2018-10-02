package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> spisok = new ArrayList<>();
        Collections.addAll(spisok, "мама", "мыла", "раму");
        spisok.add(1, "именно");
        spisok.add(3, "именно");
        spisok.add(5, "именно");
        for (int i = 0; i < spisok.size(); i++) {
            System.out.println(spisok.get(i));
        }
    }
}
