package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String filename = read.readLine();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        int id = Integer.parseInt(args[0]);
        String s = br.readLine();
        while (!s.equals("")) {
            if (Integer.parseInt(s.split(" ")[0]) == id) {
                System.out.println(s);
                break;
            }
            s = br.readLine();
        }
        br.close();
    }
}
