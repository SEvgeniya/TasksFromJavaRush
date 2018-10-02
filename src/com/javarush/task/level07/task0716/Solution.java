package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("мера"); //1
        list.add("лоза"); //2
        list.add("лира");
        list.add("вода");
        list.add("кора");
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String x = list.get(i);
            if ((x.contains("р")) && (x.contains("л"))) {
                continue;
            } else if (x.contains("р")) {
                list.remove(i);
                i --;
            } else if (x.contains("л")) {
                list.add(i + 1, x);
                i ++;
            } else break;
        }
        return list;
    }
}