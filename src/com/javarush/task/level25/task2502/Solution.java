package com.javarush.task.task25.task2502;

import java.io.IOException;
import java.util.*;

/* 
Машину на СТО не повезем!
*/
public class Solution {
    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {
        protected List<Wheel> wheels;

        public Car() throws Exception {
            wheels = new ArrayList<>();
            String[] arr = loadWheelNamesFromDB();
            int wheelCount = 0;
            for (int i = 0; i < arr.length; i ++) {
                Wheel wheel = Wheel.valueOf(arr[i]);
                wheels.add(wheel);
                wheelCount++;
            }
            if (wheelCount!=4) {
                throw new Exception();
            }
        }

        protected String[] loadWheelNamesFromDB() {
            //this method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT", "BACK_BACK"};
        }
    }

    public static void main(String[] args) {
    }
}
