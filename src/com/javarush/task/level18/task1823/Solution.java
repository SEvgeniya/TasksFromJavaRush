package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        ReadThread readThread = null;
        while (true) {
            String s = read.readLine();
            if (s.equals("exit")) break;
            else {
                readThread = new ReadThread(s);
                readThread.start();
                readThread.join();
            }
        }
    }

    public static class ReadThread extends Thread {
        String filename;

        public ReadThread(String fileName) {
            this.filename = fileName;
        }

        public void run() {
            HashMap<Byte, Integer> map = new HashMap<>();
            byte[] data = new byte[0];
            int max = Integer.MIN_VALUE;
            byte res = Byte.MIN_VALUE;

            try {
                FileInputStream in = new FileInputStream(this.filename);
                while (in.available() > 0) {
                    data = new byte[in.available()];
                    in.read(data);
                }
                in.close();
            } catch (Exception e) {

            }
            for (byte b : data) {
                if (map.containsKey(b)) {
                    int count = map.get(b) + 1;
                    map.put(b, count);
                } else map.put(b, 1);
            }
            for (Map.Entry<Byte, Integer> pair : map.entrySet()) {
                if (pair.getValue() > max) {
                    max = pair.getValue();
                    res = pair.getKey();
                }
            }
            synchronized (resultMap) {
                resultMap.put(this.filename, (int) res);
            }
        }
    }
}
