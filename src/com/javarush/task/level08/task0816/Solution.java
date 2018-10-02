package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallon", new Date("JULY 1 1980"));
        map.put("Stallo", new Date("AUGUST 1 1980"));
        map.put("Stall", new Date("JANUARY 1 1980"));
        map.put("Stal", new Date("FEBRUARY 1 1980"));
        map.put("Sta", new Date("MARCH 1 1980"));
        map.put("St", new Date("APRIL 1 1980"));
        map.put("S", new Date("MAY 1 1980"));
        map.put("Stalloner", new Date("SEPTEMBER 1 1980"));
        map.put("Stallonet", new Date("OCTOBER 1 1980"));

        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<HashMap.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            HashMap.Entry<String, Date> pair = iterator.next();
            Date date = pair.getValue();
            if (date.getMonth() >= 5 && date.getMonth() <= 7)
            {
                iterator.remove();
            }
        }

    }

    public static void main(String[] args) {
    }
}
