package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String file1 = read.readLine();
        String file2 = read.readLine();
        read.close();
        String s = "";
        BufferedReader fr = new BufferedReader(new FileReader(file1));
        BufferedWriter bw = new BufferedWriter(new FileWriter(file2));
        while (fr.ready()) {
            char data = (char) fr.read();
            s += String.valueOf(data);
        }
        //Pattern p = Pattern.compile("\\W");
        //Matcher m = p.matcher(s);
        //while (m.find()) {
        //}
        s = s.replaceAll("[^a-z A-Zа-яА-Я]", "");
        //s.split("\\s+");
        bw.write(String.valueOf(s));
        fr.close();
        bw.close();
    }
}
