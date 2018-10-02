package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String filename = read.readLine();
        BufferedReader filereader = new BufferedReader(new FileReader(filename));
        String s;
        while ((s=filereader.readLine())!=null) {
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            String reversestring = sb.toString();
            System.out.println(reversestring);
        }
        read.close();
        filereader.close();
    }
}
