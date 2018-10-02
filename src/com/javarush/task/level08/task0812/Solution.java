package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 1;
        int max = 1;
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 1; i < list.size(); i++) {
                if (list.get(i).equals(list.get(i-1))) {
                    a++;
                } else a = 1;
                if (max < a) max = a;
            }
        System.out.println(max);
        }
    }