package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> spisok = new ArrayList<>();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i ++) {
            spisok.add(0, read.readLine());
        }
        for (int i = 0; i < spisok.size(); i ++)
        {
            System.out.println(spisok.get(i));
        }
    }
}
