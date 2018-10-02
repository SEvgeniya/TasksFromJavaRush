package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private char sex;
        private String profession;
        private String country;
        private String horoscope;

        public Human (String name, int age) {
            this.name = name; this.age = age;
        }
        public Human (String name, char sex) {
            this.name = name; this.sex = sex;
        }
        public Human (String name, char sex, String profession) {
            this.name = name; this.sex = sex; this.profession = profession;
        }
        public Human (String country, String horoscope) {
            this.country = country; this.horoscope = horoscope;
        }
        public Human (String name, int age, char sex) {
            this.name = name; this.age = age; this.sex = sex;
        }
        public Human (String name, String horoscope, String profession) {
            this.name = name; this.horoscope = horoscope; this.profession = profession;
        }
        public Human (String name) {
            this.name = name;
        }
        public Human (char sex, String profession) {
            this.sex = sex; this.profession = profession;
        }
        public Human (String profession, String country, String horoscope, int age) {
            this.profession = profession; this.country = country; this.horoscope = horoscope; this.age = age;
        }
        public Human (String name, int age, char sex, String profession, String country, String horoscope) {
            this.name = name; this.age = age; this.sex = sex; this.profession = profession; this.country = country; this.horoscope = horoscope;
        }
    }
}
