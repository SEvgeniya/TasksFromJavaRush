package com.javarush.task.task32.task3213;

import java.io.IOException;
import java.io.StringReader;

/* 
Шифр Цезаря
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        StringReader reader = new StringReader("Khoor#Dpljr#&C,₷B'3");
        System.out.println(decode(reader, -3));  //Hello Amigo #@)₴?$0
    }

    public static String decode(StringReader reader, int key) throws IOException {
        int x;
        StringBuffer result = new StringBuffer();
        try {
            while ((x=reader.read())!=-1) {
                result.append(Character.toString((char) (x + key)));
            }
        }
        catch (Exception e) {
            return new String();
        }
        return result.toString();
    }
}
