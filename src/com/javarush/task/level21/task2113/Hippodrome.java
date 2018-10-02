package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome(new ArrayList<>());
        Horse horse1 = new Horse("Peter", 3, 0);
        Horse horse2 = new Horse("Mikky", 3, 0);
        Horse horse3 = new Horse("Amanda", 3, 0);
        game.horses.add(horse1);
        game.horses.add(horse2);
        game.horses.add(horse3);

        game.run();
        game.printWinner();
    }

    private List<Horse> horses;

    public List<Horse> getHorses() {
        return horses;
    }
    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }
    public static Hippodrome game;

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i ++) {
            move();
            print();
            Thread.sleep(200);
        }
    }
    public void print() {
        for (int i = 0; i < horses.size(); i ++) {
            horses.get(i).print();
        }
        for (int j = 0; j < 10; j ++) {
            System.out.println();
        }
    }
    public void move() {
        for (int i = 0; i < horses.size(); i ++) {
            horses.get(i).move();
        }
    }
    public Horse getWinner() {
        Horse winner = null;
        double maxDistance = 0;
        for (Horse horse : getHorses()) {
            if (horse.getDistance() > maxDistance) {
                maxDistance = horse.getDistance();
                winner = horse;
            }
        }
        return winner;
    }
    public void printWinner() {
        Horse winner = getWinner();
        System.out.println("Winner is " + winner.getName() + "!");
    }
}
