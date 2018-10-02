package com.javarush.task.task31.task3109;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/* 
Читаем конфиги
*/
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Properties properties = solution.getProperties("4.JavaCollections/src/com/javarush/task/task31/task3109/properties.xml");
        properties.list(System.out);

        properties = solution.getProperties("4.JavaCollections/src/com/javarush/task/task31/task3109/properties.txt");
        properties.list(System.out);

        properties = solution.getProperties("4.JavaCollections/src/com/javarush/task/task31/task3109/notExists");
        properties.list(System.out);
    }

    public Properties getProperties(String fileName) {
        Properties properties = new Properties();
        boolean isXML;
        try {
            FileInputStream inputStream = new FileInputStream(fileName);
            properties.loadFromXML(inputStream);
            isXML = true;
        } catch (IOException e) {
            isXML = false;
        }
        if (!isXML) {
            FileInputStream fileInputStream;
            try {
                fileInputStream = new FileInputStream(fileName);
                properties.load(fileInputStream);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return properties;
    }
}
