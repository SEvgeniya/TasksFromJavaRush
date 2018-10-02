package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();
    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        BufferedReader filereader = new BufferedReader(new FileReader(filename));
        //Pattern p = Pattern.compile("\\b\\d+\\b");
        while(filereader.ready()) {
            String[] arr = filereader.readLine().split(" ");
            for (Map.Entry<Integer, String> pair : map.entrySet()) {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].equals(pair.getKey().toString())) {
                        arr[i] = pair.getValue();
                    }
                }
            }
            for (int j = 0; j < arr.length; j ++) {
                System.out.print(arr[j] + " ");
                //System.out.println();
            }
            System.out.println();
        }
        reader.close();
        filereader.close();
    }
}
//D:/aaa.txt