package com.javarush.task.task22.task2210;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {
        String[]s = getTokens("level22.lesson13.task01", ".");
        for (String str : s) {
            System.out.println(str);
        }
    }
    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        String token = "";
        ArrayList<String> list = new ArrayList<>();
        while (tokenizer.hasMoreTokens()) {
            token = tokenizer.nextToken();
            list.add(token);
        }
        return list.toArray(new String[list.size()]);
    }
}
