package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> map = new HashMap<>();
        Cat cat1 = new Cat("Murka1");
        Cat cat2 = new Cat("Murka2");
        Cat cat3 = new Cat("Murka3");
        Cat cat4 = new Cat("Murka4");
        Cat cat5 = new Cat("Murka5");
        Cat cat6 = new Cat("Murka6");
        Cat cat7 = new Cat("Murka7");
        Cat cat8 = new Cat("Murka8");
        Cat cat9 = new Cat("Murka9");
        Cat cat10 = new Cat("Murka10");
        map.put("qq", cat1);
        map.put("aaa", cat2);
        map.put("aaz", cat3);
        map.put("aac", cat4);
        map.put("aaf", cat5);
        map.put("aay", cat6);
        map.put("aai", cat7);
        map.put("ara", cat8);
        map.put("aja", cat9);
        map.put("aia", cat10);
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        map.values();
        Set<Cat> set = new HashSet<>();
        for (Map.Entry<String, Cat> x : map.entrySet()) {
            set.add(x.getValue());
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
