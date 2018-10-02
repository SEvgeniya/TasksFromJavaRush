package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("odin", "q");
        map.put("dva", "w");
        map.put("tri", "e");
        map.put("chetire", "r");
        map.put("pyat", "t");
        map.put("shest", "y");
        map.put("sem", "u");
        map.put("vosem", "i");
        map.put("devyat", "o");
        map.put("desyat", "p");
        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int a = 0;
        for (String s : map.values()) {
            if (s.equals(name)) a ++;
        }
        return a;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int b = 0;
        for (String s : map.keySet()) {
            if (s.equals(lastName)) b ++;
        }
        return b;

    }

    public static void main(String[] args) {

    }
}
