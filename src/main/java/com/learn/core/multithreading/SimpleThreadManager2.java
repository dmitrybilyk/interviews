package com.learn.core.multithreading;

public class SimpleThreadManager2
{
    public static void main(String[] arg) {
        for(int i=0; i<10; i++) {
            Thread first = new SimpleThread();
            first.start();
        }
    }
}
 
class SimpleThread extends Thread
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
