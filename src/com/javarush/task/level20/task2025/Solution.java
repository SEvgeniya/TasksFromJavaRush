package com.javarush.task.task20.task2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Алгоритмы-числа
*/
public class Solution {

    public static long[] result = null;

    public static long[] getNumbers(long N) {

        List<Long> nums = new ArrayList<>();
        //StringBuilder s = new StringBuilder();
        while (N != 0) {
            nums.add(N%10);
            N = N / 10;
        }
        //String[] W = s.toString().split(" ");
        long A = 0;
        for (int i = 0; i < nums.size(); i++) {
            long B = pow(nums.get(i), nums.size());
            A += B;
        }
        for (int j = 0; ; j++) {
            if (N == A) {
                try {
                    N = result[j];
                }
                catch (NullPointerException e) {

                }
            } else break;
        }
        return result;
    }

    static private long pow(long a, long b) {
        long res = 1;
        for (int i = 1; i < b; i++) {
            res = res * a;
        }
        return res;
    }

    public static void main(String[] args) throws Exception {
        for (int i = 1; i < Long.MAX_VALUE; i++) {
            System.out.println(getNumbers(i));
        }
    }
}
