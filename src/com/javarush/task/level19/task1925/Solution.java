package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(args[1]));
        String s;
        StringBuilder builder = new StringBuilder();
        while ((s=fileReader.readLine())!=null) {
            String[] x = s.split(" ");
            for (String word : x) {
                if (word.length()>6) {
                    builder.append(word).append(",");
                }
            }
        }
        builder.deleteCharAt(builder.length()-1);
        fileWriter.write(builder.toString());
        fileReader.close();
        fileWriter.close();
    }
}
