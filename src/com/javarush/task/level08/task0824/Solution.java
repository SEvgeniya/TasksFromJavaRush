package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human ch1 = new Human("sdc", true, 20, new ArrayList<>());
        Human ch2 = new Human("fgnb", false, 24, new ArrayList<>());
        Human ch3 = new Human("toiglk", true, 19, new ArrayList<>());
        ArrayList<Human> children = new ArrayList<>();
        children.add(ch1);
        children.add(ch2);
        children.add(ch3);
        Human father = new Human("fbvc", false, 40, children);
        ArrayList<Human> fa = new ArrayList<>();
        fa.add(father);
        Human mother = new Human("sdkj", true, 40, children);
        ArrayList<Human> mo = new ArrayList<>();
        mo.add(mother);

        Human gf1 = new Human("fdjklv", true,62, fa);
        Human gf2 = new Human("fbc", false, 60, mo);
        Human gm1 = new Human("fdbvc", true, 58, fa);
        Human gm2 = new Human("djf", false, 59, mo);

        System.out.println(gf1);
        System.out.println(gf2);
        System.out.println(gm1);
        System.out.println(gm2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
    }

    public static class Human {
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children;

        public Human (String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name; this.sex = sex; this.age = age; this.children = children;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
