package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {
    public int getCountOfEggsPerMonth() {
        int egg = 70;
        return egg;
    }
    @Override
    public String getDescription() {
        String Country = "Belarus";
        int egg = getCountOfEggsPerMonth();
        return super.getDescription() + " Моя страна - " + Country + ". Я несу " + egg + " яиц в месяц.";
    }
}
