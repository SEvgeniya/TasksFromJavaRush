package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] mass = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 8; i++) {
            mass[i] = reader.readLine();
        }
        int n = mass.length;
        String temp;
        for (int i = 0; i < n / 2; i++) {
            temp = mass[n - i - 1];
            mass[n - i - 1] = mass[i];
            mass[i] = temp;
        }
        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }
    }
}