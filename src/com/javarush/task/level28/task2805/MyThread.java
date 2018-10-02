package com.javarush.task.task28.task2805;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread {
    private static int count;
    private int id = ++count;

    public void setCyclicPriority() {
        int priority = id % 10;
        if (priority == 0) priority = 10;
        int maxPriority = Thread.currentThread().getThreadGroup().getMaxPriority();
        if (priority > maxPriority) priority = maxPriority;
        this.setPriority(priority);
    }

    public MyThread() {
        this.setCyclicPriority();
    }

    public MyThread(Runnable runnable) {
        super(runnable);
        this.setCyclicPriority();
    }

    public MyThread(ThreadGroup threadGroup, Runnable runnable) {
        super(threadGroup, runnable);
        this.setCyclicPriority();
    }

    public MyThread(String s) {
        super(s);
        this.setCyclicPriority();
    }

    public MyThread(ThreadGroup threadGroup, String s) {
        super(threadGroup, s);
        this.setCyclicPriority();
    }

    public MyThread(Runnable runnable, String s) {
        super(runnable, s);
        this.setCyclicPriority();
    }

    public MyThread(ThreadGroup threadGroup, Runnable runnable, String s) {
        super(threadGroup, runnable, s);
        this.setCyclicPriority();
    }

    public MyThread(ThreadGroup threadGroup, Runnable runnable, String s, long l) {
        super(threadGroup, runnable, s, l);
        this.setCyclicPriority();
    }
}