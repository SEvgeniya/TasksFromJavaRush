package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String filename = read.readLine();
        BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
        String x = "exit";
        String s;
        for (int i = 0; ; i++) {
            s = read.readLine();
            if (!s.isEmpty() && !s.equals(x)) {
                bw.write(s);
                bw.newLine();
                continue;
            }
            if (s.equals(x))
                bw.write(x);
            break;
        }
        bw.close();
    }
}