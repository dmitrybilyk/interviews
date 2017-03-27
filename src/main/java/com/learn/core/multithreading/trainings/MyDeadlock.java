package com.learn.core.multithreading.trainings;

/**
 * Created by dmitry on 27.03.17.
 */
public class MyDeadlock {
    public static void main(String[] args) {
        Object mutextA = new Object();
        Object mutextB = new Object();
        new Thread() {
            @Override
            public void run() {
                synchronized (mutextA) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (mutextB) {
                    }
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                synchronized (mutextB) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (mutextA) {
                    }
                }
            }
        }.start();
    }
}
