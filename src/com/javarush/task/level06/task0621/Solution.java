package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String GrandpaName = reader.readLine();
        Cat catGrandpa = new Cat(GrandpaName, null, null);

        String GrandmaName = reader.readLine();
        Cat catGrandma = new Cat(GrandmaName, null, null);

        String FatherName = reader.readLine();
        Cat catFather = new Cat(FatherName, catGrandpa, null);

        String MotherName = reader.readLine();
        Cat catMother = new Cat(MotherName, null, catGrandma);

        String SonName = reader.readLine();
        Cat catSon = new Cat(SonName, catFather, catMother);

        String DaughterName = reader.readLine();
        Cat catDaughter = new Cat(DaughterName, catFather, catMother);

        System.out.println(catGrandpa);
        System.out.println(catGrandma);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);

    }

    public static class Cat {
        private String name;
        private Cat father;
        private Cat mother;

        Cat(String name, Cat father, Cat mother) {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString() {
            if (father == null && mother == null)
                return "Cat name is " + name + ", no mother, no father";
            else if (mother == null)
                return "Cat name is " + name + ", no mother, father is " + father.name;
            else if (father == null)
                return "Cat name is " + name + ", mother is " + mother.name + ", no father";
            else
                return "Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name;
        }
    }
}
