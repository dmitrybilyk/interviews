package com.learn.core.multithreading.lockInterface;

public class SynchronizedLockExample implements Runnable{
 
    private Resource resource;
     
    public SynchronizedLockExample(Resource r){
        this.resource = r;
    }
     
    @Override
    public void run() {
        synchronized (resource) {
           try
           {
              resource.doSomething();
           }
           catch (InterruptedException e)
           {
              e.printStackTrace();
           }
           resource.someSynchronizedMethod();
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

//Notice that I am using synchronized block to acquire the lock on Resource object.
// We could have created a dummy object in the class and used that for locking purpose.