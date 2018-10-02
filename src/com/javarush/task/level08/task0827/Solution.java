package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JAN 1 2000"));
    }

    public static boolean isDateOdd(String date) {
        Date yearStartTime = new Date(date);
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);

        yearStartTime.setDate(1);
        yearStartTime.setMonth(0);
        Date correctTime = new Date(date);
        long msTimeDistance = correctTime.getTime() - yearStartTime.getTime();
        long msDay = 24 * 60 * 60 * 1000;

        int dayCount = (int) (msTimeDistance/msDay);
        boolean dateOdd;
        if (dayCount % 2 == 0) {
            dateOdd = true;
        } else dateOdd = false;

        return dateOdd;
    }
}
