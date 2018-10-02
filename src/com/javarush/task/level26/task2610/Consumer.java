package com.javarush.task.task26.task2610;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private BlockingQueue queue;

    public Consumer(BlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            int i = 0;
            while(true) {
                //consume(queue.take());
                System.out.println(queue.poll());
                //queue.put(String.valueOf(i++));
                Thread.sleep(300);
            }
        }
        catch (InterruptedException ie) {
            //System.out.println(String.format("[%s] thread was terminated", Thread.currentThread().getName()));
        }
    }
    //void consume(Object x) {

    //}
}
