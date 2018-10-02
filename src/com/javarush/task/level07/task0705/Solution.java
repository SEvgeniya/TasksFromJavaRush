package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] mass1 = new int[20];
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 20; i ++)
        {
            mass1[i] = Integer.parseInt(read.readLine());
        }
        int[] mass2 = new int[10];
        int[] mass3 = new int[10];
        for(int i = 0; i < 10; i ++)
        {
            mass2[i] = mass1[i];
        }
        for(int i = 0; i < 10; i ++)
        {
            mass3[i] = mass1[i + 10];
        }
        for(int i = 0; i < 10; i ++) {
            System.out.println(mass3[i]);
        }
    }
}