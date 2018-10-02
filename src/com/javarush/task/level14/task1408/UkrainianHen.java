package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {
    public int getCountOfEggsPerMonth() {
        int a = 90;
        return a;
    }
    @Override
    public String getDescription() {
        String Country = "Ukraine";
        int egg = getCountOfEggsPerMonth();
        return super.getDescription() + " Моя страна - " + Country + ". Я несу " + egg + " яиц в месяц.";
    }
}
