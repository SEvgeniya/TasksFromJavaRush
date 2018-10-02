package com.javarush.task.task22.task2212;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Проверка номера телефона
*/
public class Solution {
    public static boolean checkTelNumber(String telNumber) {
        //String[] arrnum = telNumber.split(" ");
        //for (int i = 0; i < arrnum.length; i ++) {
        //    if (arrnum[0].equals())
        //}
        if (telNumber==null) {
            return false;
        }

        Pattern p = Pattern.compile("^\\+?([0-9]{2})?\\(?[0-9]{3}\\)?[0-9]{3}\\-?[0-9]{2}\\-?[0-9]{2}$");
        Matcher m = p.matcher(telNumber);

        if (m.find()) {
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        String a = "+380501234567";
        String b = "+38(050)1234567";
        String c = "+38050123-45-67";
        String d = "050123-4567";
        String e = "+38)050(1234567";
        String f = "+38(050)1-23-45-6-7";
        String g = "050ххх4567";
        String h = "050123456";
        String j = "(0)501234567";

        System.out.println(checkTelNumber(a));
        System.out.println(checkTelNumber(b));
        System.out.println(checkTelNumber(c));
        System.out.println(checkTelNumber(d));
        System.out.println(checkTelNumber(e));
        System.out.println(checkTelNumber(f));
        System.out.println(checkTelNumber(g));
        System.out.println(checkTelNumber(h));
        System.out.println(checkTelNumber(j));
    }
}
