package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> osn = new ArrayList<Integer>();
        ArrayList<Integer> tri = new ArrayList<Integer>();
        ArrayList<Integer> dva = new ArrayList<Integer>();
        ArrayList<Integer> nitonito = new ArrayList<Integer>();

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            osn.add(Integer.parseInt(read.readLine()));
        }
        for (int i = 0; i < osn.size(); i++) {
            Integer x = osn.get(i);
            if ((x % 3 == 0) & (x % 2 == 0)) {
                tri.add(x);
                dva.add(x);
            }
            if (x % 3 == 0 && x % 2 != 0) tri.add(x);
            if (x % 2 == 0 && x % 3 != 0) dva.add(x);
            if (x % 3 != 0 && x % 2 != 0) nitonito.add(x);
        }
        printList(tri);
        printList(dva);
        printList(nitonito);
    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
