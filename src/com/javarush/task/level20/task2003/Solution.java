package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();
    public static Properties props = new Properties();

    public void fillInPropertiesMap() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();
        FileInputStream inputStream = new FileInputStream(file);
        load(inputStream);
    }

    public void save(OutputStream outputStream) throws Exception {
        Properties properties1 = new Properties();
        for (Map.Entry<String, String> stringStringEntry : properties.entrySet()) {
            properties1.put(stringStringEntry.getKey(), stringStringEntry.getValue());
        }
        properties1.save(outputStream, null);
        outputStream.flush();
    }

    public void load(InputStream inputStream) throws Exception {
        props.load(inputStream);
        Set<String> list = props.stringPropertyNames();
        for (String current : list) {
            properties.put(current, props.getProperty(current));
        }
    }

    public static void main(String[] args) {

    }
}
