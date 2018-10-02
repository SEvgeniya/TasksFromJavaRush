package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader(args[0]);
        BufferedReader r = new BufferedReader(fr);
        TreeMap<String, Double> map = new TreeMap<>();
        TreeSet<Double> tset = new TreeSet<>();

        while (r.ready()) {
            String[] array = r.readLine().split(" ");
            if(map.containsKey(array[0])) {
                map.put(array[0], map.get(array[0]) + Double.parseDouble(array[1]));
            } else
                map.put(array[0], Double.parseDouble(array[1]));
        }

        fr.close();
        //r.close();

        tset.addAll(map.values());
        double d = tset.pollLast();

        for (Map.Entry<String, Double> pair: map.entrySet()) {
            if (pair.getValue().equals(d)) {
                System.out.println(pair.getKey());
            }
        }
    }
}
