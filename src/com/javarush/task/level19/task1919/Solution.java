package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        Map<String, Double> map = new TreeMap<>();
        //Pattern p = Pattern.compile("^[a-zA-zа-яА-Я][0-9]*[.,]?[0-9]+&");
        while (reader.ready()) {
            String[] arr = reader.readLine().split(" ");
            //Matcher m = p.matcher(s);
            if (map.containsKey(arr[0])) {
                double d = map.get(arr[0]);
                map.remove(arr[0]);
                map.put(arr[0], d + Double.parseDouble(arr[1]));
            }
            else map.put(arr[0], Double.parseDouble(arr[1]));
            }
        //ArrayList list = new ArrayList(map.entrySet());

        for (Map.Entry<String, Double> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
        reader.close();
        }
    }
