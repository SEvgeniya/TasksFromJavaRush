package com.javarush.task.task27.task2712.ad;

public class Advertisement {
    public Object content;
    public String name;
    protected long initialAmount;
    protected int hits;
    public int duration;
    protected long amountPerOneDisplaying;

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public long getAmountPerOneDisplaying() {
        return amountPerOneDisplaying;
    }

    public Advertisement(Object content, String name, long initialAmount, int hits, int duration) {
        this.content = content;
        this.name = name;
        this.initialAmount = initialAmount;
        this.hits = hits;
        this.duration = duration;
        amountPerOneDisplaying = initialAmount / hits;
    }
    public void revalidate() {
        if (hits <= 0) {
            throw new UnsupportedOperationException();
        }
        hits --;
    }
}
