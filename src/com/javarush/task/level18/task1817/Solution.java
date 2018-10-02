package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        int all = 0;
        int space = 0;
        while (inputStream.available()>0) {
            int data = inputStream.read();
            all ++;
            if (data == 32) { space++;}
        }
        inputStream.close();
        float r = ((float)space/(float)all)*100.0f;
        System.out.format("%.2f", r);
    }
}
