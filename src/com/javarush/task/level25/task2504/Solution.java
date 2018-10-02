package com.javarush.task.task25.task2504;

/* 
Switch для нитей
*/
public class Solution {
    public static void processThreads(Thread... threads) throws InterruptedException {
        for (int i = 0; i < threads.length; i ++) {
            //System.out.println(threads[i].getState());
            switch (threads[i].getState()) {
                case NEW:
                    threads[i].start();
                    break;
                case TIMED_WAITING:
                    threads[i].interrupt();
                    break;
                case WAITING:
                    threads[i].interrupt();
                    break;
                case BLOCKED:
                    threads[i].interrupt();
                    break;
                case RUNNABLE:
                    threads[i].isInterrupted();
                    break;
                case TERMINATED:
                    System.out.println(threads[i].getPriority());
                    break;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread[] t = new Thread[10];
        for (int i = 0; i < t.length; i ++) {
            t[i] = new Thread(Integer.toString(i));
        }
        processThreads(t);
    }
}
