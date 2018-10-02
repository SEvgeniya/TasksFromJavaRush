package com.javarush.task.task13.task1325;

import java.awt.*;

/* 
Компиляция программы
*/

public class Solution {

    public void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }

    public interface Animal {
        Color getColor();
    }

    public abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }

    public class BigFox extends Fox {
        public String getName() {
            return "Fox";
        }
        public Color getColor() {
            return Color.BLACK;
        }

    }

}
