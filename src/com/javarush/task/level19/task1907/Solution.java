package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String filename = read.readLine();
        read.close();
        String s = "";
        FileReader reader = new FileReader(filename);
        //Scanner in = new Scanner(new File(filename));
        int count = 0;

        while (reader.ready()) {
            char data = (char) reader.read();
            s += String.valueOf(data).toLowerCase();
        }
        s = s.replaceAll("\\p{Punct}", " ");
        s = s.replace("\n", " ");
        String[] x = s.split("\\W");
        for (String y : x) {
            s = s.trim();
            if (y.equals("world")) {
                count++;
            }
        }
        reader.close();
        System.out.println(count);
    }
}
