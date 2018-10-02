package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> pshh = new ArrayList<String>();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i ++){
            pshh.add(read.readLine());
        }
        pshh.remove(2);
        for (int i = 0; i < pshh.size(); i ++){
            int a = pshh.size() - i - 1;
            System.out.println(pshh.get(a));
        }
    }
}


