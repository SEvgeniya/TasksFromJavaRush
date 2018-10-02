package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Иванов1", 500);
        map.put("Иванов2", 1500);
        map.put("Иванов3", 400);
        map.put("Иванов4", 600);
        map.put("Иванов5", 800);
        map.put("Иванов6", 100);
        map.put("Иванов7", 900);
        map.put("Иванов8", 300);
        map.put("Иванов9", 5500);
        map.put("Иванов10", 50);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, Integer> pair = iterator.next();
            int zp = pair.getValue();
            if (zp < 500)
            {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}