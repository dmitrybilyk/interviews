package com.learn.core.multithreading.threads.lock.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Java program to show, how to use ReentrantLock in Java.
 * Reentrant lock is an alternative way of locking
 * apart from implicit locking provided by synchronized keyword in Java.
 *
 * @author  Javin Paul
 */
public class ReentrantLockHowto {

    private final ReentrantLock lock = new ReentrantLock();
    private int count = 0;

     //Locking using Lock and ReentrantLock
     public int getCount() {
//        lock.lock();
//        try {
            System.out.println(Thread.currentThread().getName() + " gets Count: " + count);
            return count++;
//        } finally {
//            lock.unlock();
//        }
     }

//     //Implicit locking using synchronized keyword
//     public synchronized int getCountTwo() {
//            return count++;
//     }

    

    public static void main(String args[]) {
        final ThreadTest counter = new ThreadTest();
        Thread t1 = new Thread() {

            @Override
            public void run() {
                while (counter.getCount() <= 6) {
                    try {
                        Thread.sleep(100);
                        counter.increamentCount();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();                    }
                }
            }
        };
      
        Thread t2 = new Thread() {

            @Override
            public void run() {
                while (counter.getCount() <= 6) {
                    try {
                        Thread.sleep(100);
                        counter.increamentCount();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        };
      
        t1.start();
        t2.start();
      
    }
}
