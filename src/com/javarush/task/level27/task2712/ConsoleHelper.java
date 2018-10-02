package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ConsoleHelper {
    public static void writeMessage(String message) {
        System.out.println(message);
    }
    public static String readString() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        try {
            input = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }
    public static List<Dish> getAllDishesForOrder() {
        List<Dish> list = new ArrayList<>();
        while(true) {
            writeMessage(Dish.allDishesToString());
            writeMessage("Введите название блюда");
            String input = readString();
            if (input.equals("exit")) break;
            Dish dish = null;
            for (Dish element : Dish.values()) {
                if (element.toString().toLowerCase().equals(input.toLowerCase())) { dish = element; }
            }
            if (dish!=null) {
                list.add(dish);
            }
        }
        return list;
    }
}
