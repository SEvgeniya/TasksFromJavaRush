package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> spisok = new ArrayList<>();
        BufferedReader rrr = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i ++)
        {
            spisok.add(rrr.readLine());
        }
        int min = spisok.get(0).length();
        for (int i = 0; i < spisok.size(); i ++)
        {
            if (spisok.get(i).length() < min)
                min = spisok.get(i).length();
        }
        for (int i = 0; i < spisok.size(); i ++)
            if (spisok.get(i).length() == min)
                System.out.println(spisok.get(i));
    }
}
