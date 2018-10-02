package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> map = new HashMap<>();
        map.put("q", "qq");
        map.put("w", "ww");
        map.put("e", "ee");
        map.put("r", "rr");
        map.put("t", "tt");
        map.put("q", "ww");
        map.put("r", "qq");
        map.put("t", "ee");
        map.put("w", "tt");
        map.put("e", "ii");
        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
