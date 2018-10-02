package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        char [] arr = s.toCharArray();
        for (int i = 0; i < 40; i ++)
        {
            System.out.println(s.substring(i));
            arr[i] = 0;
        }
    }
}