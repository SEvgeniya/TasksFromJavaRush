package com.javarush.task.task24.task2410;

import java.util.LinkedList;
import java.util.List;

/* 
Рефакторинг, анонимные классы
*/
public class Solution {
    public static List<Iterator> iterators = new LinkedList<>();

    private int countItems;

    public Iterator getIterator(final String name) {
        Iterator iterator = new Iterator() {
            String iteratorName;
            {
                iteratorName = name;
                countItems++;
                System.out.println(iteratorName + " item " + countItems);
            }
            @Override
            public Iterator next() {
                return getIterator(name);
            }
        };
        return iterator;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        Iterator iterator = solution.getIterator("iterator");
        for (int i = 1; i < 5; i++) {
            iterators.add(iterator.next());
        }
    }
}
