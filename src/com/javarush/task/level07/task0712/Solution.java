package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i ++)
        {
            list.add(read.readLine());
        }
        int min = list.get(0).length();
        int a = 0;
        for (int i = 0; i < list.size(); i ++) {
            if (list.get(i).length() < min) {
                min = list.get(i).length();
                a = i;
            }
        }
        int max = list.get(0).length();
        int b = 0;
        for (int i = 0; i < list.size(); i ++) {
            if (list.get(i).length() > max) {
                max = list.get(i).length();
                b = i;
            }
        }
        if (a < b)
            System.out.println(list.get(a));
        else System.out.println(list.get(b));
        }
    }