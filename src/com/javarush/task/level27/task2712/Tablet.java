package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.ad.AdvertisementManager;
import com.javarush.task.task27.task2712.ad.NoVideoAvailableException;
import com.javarush.task.task27.task2712.kitchen.Order;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Tablet extends java.util.Observable {
    final int number;
    private static Logger logger = Logger.getLogger(Tablet.class.getName());

    public Tablet(int number) {
        this.number = number;
    }
    public Order createOrder() {
        AdvertisementManager manager = new AdvertisementManager(10);
        Order newOrder;
        try {
            newOrder = new Order(this);
            ConsoleHelper.writeMessage(newOrder.toString());
            setChanged();
            if (!newOrder.isEmpty()) {
                notifyObservers(newOrder);
            }
            try {
                manager.processVideos();
            }
            catch (NoVideoAvailableException e) {
                logger.log(Level.INFO, "No video is available for the order " + newOrder);
            }
        }
        catch (Exception e) {
            logger.log(Level.SEVERE,"Console is unavailable.");
            return null;
        }
        return newOrder;
    }
    @Override
    public String toString() {
        return "Tablet{" +
                "number=" + number +
                '}';
    }
}
