package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread {
    private Thread thread;

    public LoggingStateThread(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        State state = null;

        while (true) {
            State newState = thread.getState();
            if (newState != state) {
                state = newState;
                System.out.println(state);
            }
            if (state == State.TERMINATED) {
                break;
            }
        }
    }
}