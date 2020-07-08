package com.learn.core.multithreading.deadlock;

/**
 * Created by dmitry on 27.03.17.
 */
public class Deadlock {
    public static void main (String[] args)
    {
        final Object mutexA = new Object();
        final Object mutexB = new Object();

        new Thread() {
            @Override
            public void run () {
                try {
                    synchronized (mutexA) {
                        Thread.sleep(50);
                        synchronized (mutexB) {
                            System.out.println("OMG!");
                        }
                    }
                }
                catch (InterruptedException ex)
                { }
            }
        }.start();

        new Thread() {

            @Override
            public void run () {
                try {
                    synchronized (mutexB) {
                        Thread.sleep(50);
                        synchronized (mutexA) {
                            System.out.println("OMG!");
                        }
                    }
                }
                catch (InterruptedException ex)
                { }
            }
        }.start();
    }
}
