package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grandfa1 = new Human("Вася", false, 60);
        Human grandfa2 = new Human("fdjvkdf", false, 65);
        Human grandma1 = new Human("dgjkvdfn", true, 59);
        Human grandma2 = new Human("fkvkx", true, 58);
        Human father = new Human("vxcvxcv", false, 50, grandfa1, grandma1);
        Human mother = new Human("vcdsk", true, 48, grandfa2, grandma2);
        Human ch1 = new Human("fvdf", false, 15, father, mother);
        Human ch2 = new Human("vxvd", true, 20, father, mother);
        Human ch3 = new Human("dvcxd", false, 25, father, mother);
        System.out.println(grandfa1);
        System.out.println(grandfa2);
        System.out.println(grandma1);
        System.out.println(grandma2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
    }

    public static class Human {
        String name; boolean sex; int age;
        Human father;
        Human mother;

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
        public Human (String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human (String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex; this.age = age;
            this.father = father;
            this.mother = mother;
        }
    }
}






















