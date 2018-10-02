package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws DownloadException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        try {
            for (int i = 0; ; i++) {
                String filename = read.readLine();
                FileInputStream inputStream = new FileInputStream(filename);
                while (inputStream.available() > 0) {
                    int data = inputStream.read();
                    list.add(data);
                }
                if (list.size() >= 1000) {
                    list.clear();
                    i++;
                    continue;
                } else if (list.size() < 1000){
                    read.close();
                    inputStream.close();
                    throw new DownloadException();
                }
                break;
            }
        }
        catch (FileNotFoundException e) {

        }
        catch (IOException e) {

        }
    }

    public static class DownloadException extends Exception {

    }
}
