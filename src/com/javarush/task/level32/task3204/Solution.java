package com.javarush.task.task32.task3204;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;

/* 
Генератор паролей
*/
public class Solution {
    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        String letters = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i ++) {
            sb.append(letters.charAt((int) (Math.random()*26)));
        }
        for (int i = 0; i < 3; i ++) {
            sb.append(digits.charAt((int) (Math.random()*10)));
        }
        for (int i = 0; i < 2; i ++) {
            sb.append(letters.toUpperCase().charAt((int) (Math.random()*26)));
        }
        try {
            baos.write(sb.toString().getBytes());
        } catch (IOException e) {

        }
        return baos;
    }
}