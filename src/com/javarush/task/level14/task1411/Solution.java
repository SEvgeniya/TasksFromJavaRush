package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        ArrayList list = new ArrayList();
        for (int i = 0; ; i ++) {
            while((key = reader.readLine())!=null) {
                if(key.equals("user")||key.equals("loser")||key.equals("coder")||key.equals("proger")) {
                    list.add(key);
                }
                else break;
            }
            break;
        }
        {
            for (int i = 0; i < list.size(); i ++) {
                if (list.get(i).equals("user")) {
                    Person.User user = new Person.User();
                    person = user;
                }
                else if (list.get(i).equals("loser")) {
                    Person.Loser loser = new Person.Loser();
                    person = loser;
                }
                else if (list.get(i).equals("coder")) {
                    Person.Coder coder = new Person.Coder();
                    person = coder;
                }
                else if (list.get(i).equals("proger")) {
                    Person.Proger proger = new Person.Proger();
                    person = proger;
                }
                doWork(person);
            }
        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        }
        else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        }
        else if (person instanceof Person.Coder) {
            ((Person.Coder) person).coding();
        }
        else if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }

    }
}
