package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen {
    public int getCountOfEggsPerMonth() {
        int a = 80;
        return a;
    }
    @Override
    public String getDescription() {
        String Country = "Moldova";
        int egg = getCountOfEggsPerMonth();
        return super.getDescription() + " Моя страна - " + Country + ". Я несу " + egg + " яиц в месяц.";
    }
}
