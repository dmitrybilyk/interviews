package com.learn.core.multithreading.counter;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CounterTester
{
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        for(int i=0; i<200; i++) {
            CounterThread ct = new CounterThread(counter);
            ct.start();
//            ct.join();
        }
//        Thread.sleep(1000);
        
        System.out.println("Counter:" + counter.getCounter());
    }
}
 
class Counter
{
    private long counter = 0L;
    
    public void increaseCounter() {
//        synchronized(this) {
            counter++;
//        }
    }
    
    public long getCounter() {
        return counter;
    }
}
 
class CounterThread extends Thread
{
    private Lock reentrantLock;
    private Counter counter;
    
    public CounterThread(Counter counter) {
        this.counter = counter;
        reentrantLock = new ReentrantLock();
    }
    
    @Override
    public void run() {
        reentrantLock.lock();
        try {
            for(int i=0; i<1000; i++) {
                counter.increaseCounter();
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
