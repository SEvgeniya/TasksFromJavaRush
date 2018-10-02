package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] chislo = new int[10];
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 10; i ++)
        {
            chislo[i] = Integer.parseInt(read.readLine());
        }
        for(int i = chislo.length - 1; i >= 0; i --)
        {
            System.out.println(chislo[i]);
        }
    }
}
