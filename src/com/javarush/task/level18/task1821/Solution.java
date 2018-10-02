package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream(args[0]);
        TreeMap<Character, Integer> map = new TreeMap<>();
        byte[] bytes = new byte[in.available()];
        in.read(bytes);

        for (int i = 0; i < bytes.length; i ++) {
            Character ch = Character.valueOf((char)bytes[i]);
            if (!map.containsKey((char)bytes[i])) {
                map.put(ch, 1);
            }
            else {
                map.replace(ch, map.get(ch)+1);
            }
        }
        for (Map.Entry<Character, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
        in.close();
    }
}
