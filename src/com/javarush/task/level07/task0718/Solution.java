package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> spisok = new ArrayList<>();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i ++) {
            spisok.add(read.readLine());
        }
        int a = 0;

        for (int i = 0; i < spisok.size(); i ++){
            if (spisok.get(i + 1).length() >= spisok.get(i).length()) {
                continue;
            }
            else if (spisok.get(i + 1).length() < spisok.get(i).length()) {
                a = i + 1;
                break;
            }
        }
        System.out.println(a);
    }
}

