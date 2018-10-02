package com.javarush.task.task30.task3010;

/* 
Минимальное допустимое основание системы счисления
*/

import java.math.BigDecimal;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        try {
            BigDecimal num;
            boolean flag = false;
            for (int i = 2; i < 37; i++) {
                try {
                    num = new BigDecimal(new BigInteger(args[0], i));
                    flag = true;
                    if (flag) {
                        System.out.println(i);
                        break;
                    }
                } catch (Exception e) {
//                        System.out.println("incorrect");
                }
            }
            if (!flag) {
                throw new IllegalArgumentException();
            }
        } catch (Exception e) {
//                e.printStackTrace();
            System.out.println("incorrect");
        }
    }
}