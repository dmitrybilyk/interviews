package com.learn.core.multithreading;

public class SimpleThreadManager
{
    public static void main(String[] arg) {
        for(int i=0; i<10; i++) {
            Runnable first = new SimpleRunnable();
            Thread t = new Thread(first);
            t.start();
        }
    }
}
 
class SimpleRunnable implements Runnable
{
    @Override
    public void run() {
        try {
            long pause = Math.round(Math.random()*2000);
            Thread.sleep(pause);
            System.out.println("Simple Thread - pause="+pause);
        } catch(InterruptedException i_ex) {
            
        }
    }
}
