package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        String s;
        Pattern p = Pattern.compile("\\S*\\d+\\S*");
        while ((s=reader.readLine())!=null) {
            //String[] arr = s.split(" ");
            Matcher m = p.matcher(s);
            while (m.find()) {
                writer.write(m.group() + " ");
            }
        }
        reader.close();
        writer.close();
    }
}
