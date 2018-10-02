package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<String> files = new ArrayList<>();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String file;
        String simpleFileName;
        String simpleFileExt;
        while (true) {
            file = read.readLine();
            if (!file.equals("end")) {
                files.add(file);
            }
            else break;
        }
        Collections.sort(files);
        String[] namefile = files.get(0).split("\\.");
        simpleFileName = namefile[0];
        simpleFileExt = namefile[1];
        FileOutputStream out = new FileOutputStream(simpleFileName + "." + simpleFileExt);
        for (String s : files) {
            FileInputStream in = new FileInputStream(s);
            if (in.available()>0) {
                byte[] buf = new byte[in.available()];
                int count = in.read(buf);
                out.write(buf, 0, count);
            }
            in.close();
        }
        out.close();
        read.close();
    }
}
