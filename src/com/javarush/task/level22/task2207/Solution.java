package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        reader.close();
        FileInputStream fis = new FileInputStream(filename);
        BufferedReader buffred = new BufferedReader(new InputStreamReader(fis));
        ArrayList<String> fromfile = new ArrayList<>();
        while (buffred.ready()) {
            fromfile.addAll(Arrays.asList(buffred.readLine().split(" ")));
        }
        buffred.close();

        Map<String, String> pairs = new HashMap<>();
        for (int i = 0; i < fromfile.size(); i ++) {
            String a = fromfile.get(i);
            StringBuilder sb = new StringBuilder(a);
            String aReverse = sb.reverse().toString();
            for (int j = i+1; j < fromfile.size(); j ++) {
                if (pairs.containsKey(a)) { continue; }
                if (pairs.containsKey(aReverse)) { continue; }

                StringBuilder strb = new StringBuilder(fromfile.get(j));
                String rev = strb.reverse().toString();

                if (a.equals(rev)) {
                    pairs.put(a, strb.reverse().toString());
                }
            }
        }
        for (Map.Entry<String, String> x : pairs.entrySet()) {
            Pair pair = new Pair();
            pair.first = x.getKey();
            pair.second = x.getValue();
            result.add(pair);
        }
        for (Pair p : result) {
            System.out.println(p.first + " " + p.second);
        }
    }

    public static class Pair {
        String first;
        String second;

        public Pair() {

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
