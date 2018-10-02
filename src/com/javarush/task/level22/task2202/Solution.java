package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        if (string==null) throw new TooShortStringException();
        int spaceCount = 0;
        for (int i = 0; i < string.length(); i ++) {
            if (string.substring(i, i+1).equals(" ")) {
                spaceCount++;
            }
        }
        String[] arr = string.split("\\s");
        String str = "";
        if (spaceCount<4) {
            throw new TooShortStringException();
        }
        else {
            for (int j = 1; j < arr.length; j++) {
                if (j < 4) {
                    str += arr[j] + " ";
                }
                if (j == 4) {
                    str += arr[j];
                }
            }
        }
        return str;
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
