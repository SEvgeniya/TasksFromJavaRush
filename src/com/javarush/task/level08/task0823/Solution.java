package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        char[] x = s.toCharArray();
        x[0] = Character.toUpperCase(x[0]);
        for (int i = 0; i < x.length; i ++) {
            if (x[i] == ' ') {
                x[i + 1] = Character.toUpperCase(x[i + 1]);
            }
        }
        s = new String(x);
        System.out.println(s);
        }
    }