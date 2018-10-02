package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String s = read.readLine();
        String z = s.replaceAll("\\s", "");
        char[] x = z.toCharArray();
        ArrayList<Character> vowel = new ArrayList<>();
        ArrayList<Character> consonant = new ArrayList<>();
        for (int i = 0; i < x.length; i++) {
            if (isVowel(x[i])) {
                vowel.add(x[i]);
            } else consonant.add(x[i]);
        }
        for (int i = 0; i < vowel.size(); i++) {
            System.out.print(vowel.get(i) + " ");
        }
            System.out.println(" ");
            for (int i = 0; i < consonant.size(); i++) {
                System.out.print(consonant.get(i) + " ");
            }
        }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}