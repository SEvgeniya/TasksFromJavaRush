package com.javarush.task.task14.task1408;

public class RussianHen extends Hen {
    public int getCountOfEggsPerMonth() {
        int a = 100;
        return a;
    }

    @Override
    public String getDescription() {
        String Country = "Russia";
        int egg = getCountOfEggsPerMonth();
        return super.getDescription() + " Моя страна - " + Country + ". Я несу " + egg + " яиц в месяц.";
    }
}
