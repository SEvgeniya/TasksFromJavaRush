package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        List<String> cities = new ArrayList<>();
        List<String> lastnames = new ArrayList<String>();
        while (true) {
            String city = reader.readLine();
            cities.add(city);
            if (city.isEmpty()) {break;}
            String ln = reader.readLine();
            lastnames.add(ln);
        }
        //read home number
        String s = reader.readLine();
        for (int i = 0; i < cities.size(); i ++) {
            if (s.equals(cities.get(i))) {
                System.out.println(lastnames.get(i));
            }
        }
    }
}
