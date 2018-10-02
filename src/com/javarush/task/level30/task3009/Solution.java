package com.javarush.task.task30.task3009;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

/* 
Палиндром?
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getRadix("112"));        //expected output: [3, 27, 13, 15]
        System.out.println(getRadix("123"));        //expected output: [6]
        System.out.println(getRadix("5321"));       //expected output: []
        System.out.println(getRadix("1A"));         //expected output: []
    }
    private static Set<Integer> getRadix(String number) {
        Set<Integer> set = new HashSet<>();
        BigInteger num = null;
        try {
            num = new BigInteger(number);
        }
        catch (NumberFormatException e) {
            return set;
        }
        String convertedNumber = "";
        String reversed = "";
        for (int i = 2; i <= 36; i ++) {
            convertedNumber = num.toString(i);
            reversed = new StringBuffer(convertedNumber).reverse().toString();
            if (convertedNumber.equals(reversed)) {
                set.add(i);
            }
        }
        return set;
    }
}