package com.learn.core.multithreading.lockInterface;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
 
public class ConcurrencyLockExample implements Runnable{
 
    private Resource resource;
    private Lock lock;
     
    public ConcurrencyLockExample(Resource r){
        this.resource = r;
        this.lock = new ReentrantLock();
    }
     
    @Override
    public void run() {
        try {
            lock.tryLock(10, TimeUnit.SECONDS);
            resource.doSomething();
            resource.someSynchronizedMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally{
            //release lock
            lock.unlock();
        }
       try
       {
          resource.doLogging();
       }
       catch (InterruptedException e)
       {
          e.printStackTrace();
       }
    }
 
}

