package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new FileReader(args[0]));
        //Pattern p = Pattern.compile("^[a-z\\sA-Z\\s а-я\\sА-Я]");
        String s = "";
        while (read.ready()) {
            String name = "";
            String date = "";
            StringBuilder sb = new StringBuilder();
            s = read.readLine();
            if (!s.isEmpty()) {
                String[] arr = s.split(" ");
                for (int i = 0; i < arr.length; i++) {
                    if (!arr[i].matches("[-+]?\\d+")) {
                        name += arr[i] + " ";
                    } else date += arr[i] + " ";
                }
                sb.append(name);
                sb.deleteCharAt(name.length() - 1);
                Date date1 = new SimpleDateFormat("dd MM yyyy").parse(date);
                PEOPLE.add(new Person(sb.toString(), date1));
            }
        }
        read.close();
    }
}
