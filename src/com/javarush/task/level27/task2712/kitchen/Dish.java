package com.javarush.task.task27.task2712.kitchen;

import java.util.ArrayList;

public enum Dish {
    Fish(25),
    Steak(30),
    Soup(15),
    Juice(5),
    Water(3);

    private int duration;
    Dish(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public static String allDishesToString() {
        ArrayList<String> dishList = new ArrayList<>();
        dishList.add(String.valueOf(Fish));
        dishList.add(String.valueOf(Steak));
        dishList.add(String.valueOf(Soup));
        dishList.add(String.valueOf(Juice));
        dishList.add(String.valueOf(Water));
        return dishList.toString();
    }
}
