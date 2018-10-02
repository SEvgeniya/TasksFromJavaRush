package com.javarush.task.task19.task1904;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String[] pers = fileScanner.nextLine().split(" ");
            String q = " ";
            String date = pers[3] + q + pers[4] + q + pers[5];
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
                Date dat = sdf.parse(date);
                return new Person(pers[1], pers[2], pers[0], dat);
            }
            catch (ParseException pe) {
                pe.printStackTrace();
            }
            return null;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
