package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String s = read.readLine();
        read.close();
        FileInputStream inputStream = new FileInputStream(s);
        HashMap<Integer, Integer> map = new HashMap<>();

        while (inputStream.available()>0) {
            int data = inputStream.read();
            if (map.containsKey(data)) {
                int count = map.get(data);
                map.put(data, ++count);
            }
            else map.put(data, 1);
        }
        inputStream.close();

        if (map.size()<=0) {
            return;
        }
        else {
            int max = Collections.max(map.values());
            for (HashMap.Entry<Integer, Integer> pair : map.entrySet()) {
                if (pair.getValue() == max) {
                    System.out.print(pair.getKey() + " ");
                }
            }
        }
    }
}
