package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String filename = null;
        FileInputStream in = null;
        while (true) {
            filename = read.readLine();
            try {
                in = new FileInputStream(filename);
                in.close();
            }
            catch (FileNotFoundException e) {
                System.out.println(filename);
                read.close();
                break;
            }
        }
    }
}
