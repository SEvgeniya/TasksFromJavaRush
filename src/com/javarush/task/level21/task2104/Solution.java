package com.javarush.task.task21.task2104;

import java.util.HashSet;
import java.util.Set;

/* 
Equals and HashCode
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }


    public boolean equals(Object obj) {
        if (obj==this) return true;
        if (!(obj instanceof Solution)) return false;
        Solution n = (Solution) obj;
        //if (n==null||getClass()!=n.getClass()) return false;
        return (first !=null ? first.equals(n.first) : n.first==null) && (last != null ? last.equals(n.last) : n.last==null);
    }

    public int hashCode() {
        int result = 1;
        final int prime = 31;
        result = prime * result + ((first == null) ? 0 : first.hashCode());
        result = prime * result + ((last == null) ? 0 : last.hashCode());
        return result;
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(new Solution("Donald", "Duck")));
    }
}
