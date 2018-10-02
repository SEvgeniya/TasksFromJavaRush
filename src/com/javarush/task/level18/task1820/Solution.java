package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        File file1 = new File(read.readLine());
        File file2 = new File(read.readLine());
        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream ous = new FileOutputStream(file2);

        while(fis.available()>0) {
            byte[] data = new byte[fis.available()];
            fis.read(data);
            ous.write(getInput(data));
        }
        fis.close();
        ous.close();
    }
    private static byte[] getInput(byte[] data) {
        StringBuilder builder = new StringBuilder();
        String[] s = new String(data).split(" ");
        byte[] res;
        long[] tmp = new long[s.length];

        for (int i = 0; i < s.length; i++) {
            tmp[i] = Math.round(Double.valueOf(s[i]));
        }
        for (long i : tmp) {
            builder.append(i);
            builder.append(" ");
        }
        res = builder.toString().getBytes();
        return res;
    }
}
