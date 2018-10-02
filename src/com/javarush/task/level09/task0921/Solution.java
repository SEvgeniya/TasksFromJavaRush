package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        ArrayList<Integer> list = new ArrayList<>();
        try {
            for (int i = 0; ; i ++) {
                BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
                list.add(Integer.parseInt(read.readLine()));
            }
        }
        catch (Exception e)
        {
            for (int i = 0; i < list.size(); i ++) {
                System.out.println(list.get(i));
            }
        }
    }
}
