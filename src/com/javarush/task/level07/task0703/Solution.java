package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] stroka = new String[10];
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 10; i ++) {
            stroka[i] = read.readLine();
        }
        int[] chislo = new int[10];
        for(int i = 0; i < 10; i ++)
        {
            chislo[i] = stroka[i].length();
        }
        for(int i = 0; i < chislo.length; i ++) {
            System.out.println(chislo[i]);
        }
    }
}
