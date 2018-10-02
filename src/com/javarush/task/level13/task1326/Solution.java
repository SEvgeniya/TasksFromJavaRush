package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            String filename = read.readLine();
            Scanner scanner = new Scanner(new FileInputStream(filename));
            //FileInputStream fis = new FileInputStream(filename);
            ArrayList<Integer> list = new ArrayList<>();
            while (scanner.hasNextInt()) {
                int a = scanner.nextInt();
                if (a % 2 == 0)
                    list.add(a);
            }
            read.close();
            scanner.close();
            Collections.sort(list);
            for (Integer x : list) {
                System.out.println(x);
            }
        }
    }
