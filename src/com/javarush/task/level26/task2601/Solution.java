package com.javarush.task.task26.task2601;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/*
Почитать в инете про медиану выборки
*/
public class Solution {

    public static void main(String[] args) {
        Integer[] arr = new Integer[5];
        arr[0] = 13;
        arr[1] = 8;
        arr[2] = 15;
        arr[3] = 5;
        arr[4] = 17;
        //System.out.println(Arrays.toString(sort(arr)));
    }

    public static Integer[] sort(Integer[] array) {
        Arrays.sort(array);
       double mediana;
       if (array.length%2==0) {
           mediana = ((double) array[array.length/2] + (double)array[array.length/2-1])/2;
       }
       else mediana = array[array.length/2];

        Comparator<Integer> compareByMediana = (o1, o2) -> {
            double value = Math.abs(o1-mediana) - Math.abs(o2-mediana);
            if (value==0) {
                value = o1-o2;
            }
            return (int) value;
        };
        Arrays.sort(array, compareByMediana);
        System.out.println(mediana);

        return array;
    }
}
