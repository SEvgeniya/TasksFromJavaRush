package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        reader.close();
        BufferedReader filereader = new BufferedReader(new FileReader(filename));
        String s;
        while ((s=filereader.readLine())!=null) {
            int count = 0;
            //String s = filereader.readLine();
            String[] arr = s.split(" ");
            for (int j = 0; j < words.size(); j++) {
                for (int i = 0; i < arr.length; i++) {
                    if (words.get(j).equals(arr[i])) {
                        count++;
                    }
                }
            }
            if (count == 2) {
                System.out.println(s);
            }
        }
        filereader.close();
    }
}