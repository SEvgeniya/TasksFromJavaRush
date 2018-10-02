package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        int[] list = new int[20];
        for (int i = 0; i < 20; i++) {
            list[i] = Integer.parseInt(reader.readLine());
        }
        maximum = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] > maximum) {
                maximum = list[i];
            }
        }
        minimum = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] < minimum) {
                minimum = list[i];
             }
            }
            System.out.print(maximum + " " + minimum);
        }
    }
