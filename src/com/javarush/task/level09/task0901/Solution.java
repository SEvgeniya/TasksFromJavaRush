package com.javarush.task.task09.task0901;

/* 
Возвращаем StackTrace
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static StackTraceElement[] method1() {
        method2();
        StackTraceElement[] stackTraceElements1 = Thread.currentThread().getStackTrace();
        return stackTraceElements1;
    }

    public static StackTraceElement[] method2() {
        method3();
        StackTraceElement[] stackTraceElements2 = Thread.currentThread().getStackTrace();
        return stackTraceElements2;
    }

    public static StackTraceElement[] method3() {
        method4();
        StackTraceElement[] stackTraceElements3 = Thread.currentThread().getStackTrace();
        return stackTraceElements3;
    }

    public static StackTraceElement[] method4() {
        method5();
        StackTraceElement[] stackTraceElements4 = Thread.currentThread().getStackTrace();
        return stackTraceElements4;
    }

    public static StackTraceElement[] method5() {
        StackTraceElement[] stackTraceElements5 = Thread.currentThread().getStackTrace();
        return stackTraceElements5;
    }
}
