package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String file1 = read.readLine();
        String file2 = read.readLine();
        read.close();
        String s = "";

        BufferedReader fileread = new BufferedReader(new FileReader(file1));
        BufferedWriter filewrite = new BufferedWriter(new FileWriter(file2));
        while (fileread.ready()) {
            char data = (char) fileread.read();
            //int data = fileread.read();
            s += String.valueOf(data);
        }
        Pattern p = Pattern.compile("(?u)\\b[\\d]+\\b");
        Matcher m = p.matcher(s);
        //StringBuilder sb = new StringBuilder();
        while (m.find()) {
            //String num;
            //num = s.substring(m.start(), m.end());
            //sb.append(num);
            //sb.append(" ");
            //filewrite.write(String.valueOf(sb));
            filewrite.write(String.valueOf(m.group()) + " ");
        }
        fileread.close();
        filewrite.close();
    }
}
