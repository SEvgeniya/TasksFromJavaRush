package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        String s = "";
        BufferedReader fr = new BufferedReader(new FileReader(file1));
        BufferedWriter bw = new BufferedWriter(new FileWriter(file2));
        while (fr.ready()) {
            char data = (char) fr.read();
            s += String.valueOf(data);
        }
        fr.close();

        StringBuilder sb = new StringBuilder();
        //s.replaceAll(".", "!");
        //sb.append(s.replaceAll(".", "!"));
        //Pattern p = Pattern.compile("\\W\\.");
        //Matcher m = p.matcher(s);

        sb.append(s.replace(".","!"));
        bw.write(String.valueOf(sb));
        //bw.write(String.valueOf(sb));
        bw.close();
    }
}
