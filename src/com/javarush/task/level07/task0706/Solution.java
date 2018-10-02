package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] mass = new int[15];
        int chot = 0;
        int nechot = 0;
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 15; i ++) {
            mass[i] = Integer.parseInt(read.readLine());
            if (i % 2 == 0) {
                chot += mass[i];
            } else nechot += mass[i];
        }
        if (chot > nechot)
        {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        else if (nechot > chot)
        {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
