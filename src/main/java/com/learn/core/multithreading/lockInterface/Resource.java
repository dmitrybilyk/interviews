package com.learn.core.multithreading.lockInterface;
 
public class Resource {
 
    public void doSomething() throws InterruptedException
    {
       System.out.println("I'm doing something");
       Thread.sleep(4000);
    }
     
    public synchronized void doLogging() throws InterruptedException
    {
       System.out.println("I'm logging");

    }

    public synchronized void someSynchronizedMethod(){
       System.out.println("I'm in synchronized method");
    }
}