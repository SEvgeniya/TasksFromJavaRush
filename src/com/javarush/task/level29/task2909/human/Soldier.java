package com.javarush.task.task29.task2909.human;

public class Soldier extends Human {
    public void live() {
        fight();
    }

    public void fight() {
    }

    public Soldier(String name, int age) {
        super(name, age);
    }
}
