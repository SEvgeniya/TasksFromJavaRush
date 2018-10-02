package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.RUSSIA);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            if (country.equals("Belarus")) hen = new BelarusianHen();
            if (country.equals("Moldova")) hen = new MoldovanHen();
            if (country.equals("Russia")) hen = new RussianHen();
            if (country.equals("Ukraine")) hen = new UkrainianHen();
            return hen;
        }
    }


}
