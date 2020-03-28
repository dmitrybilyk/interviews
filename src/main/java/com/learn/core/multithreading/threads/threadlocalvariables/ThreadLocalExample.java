package com.learn.core.multithreading.threads.threadlocalvariables;

import java.text.SimpleDateFormat;
import java.util.Random;

//Every thread has it’s own ThreadLocal variable and they can use it’s get()
// and set() methods to get the default value or change it’s value local to
// Thread. ThreadLocal instances are typically private static fields in
// classes that wish to associate state with a thread.

public class ThreadLocalExample implements Runnable{
 
    // SimpleDateFormat is not thread-safe, so give one to each thread
 // SimpleDateFormat is not thread-safe, so give one to each thread
    private static final ThreadLocal<SimpleDateFormat> formatter = new ThreadLocal<SimpleDateFormat>(){
        @Override
        protected SimpleDateFormat initialValue()
        {
            return new SimpleDateFormat("yyyyMMdd HHmm");
        }
    };

    private static final ThreadLocal<String> someString = new ThreadLocal<String>() {
        @Override
        protected String initialValue() {
            return "some initial value";
        }
    };
     
    public static void main(String[] args) throws InterruptedException {
        ThreadLocalExample obj = new ThreadLocalExample();
        for(int i = 0 ; i < 3; i++){
            Thread t = new Thread(obj, "" +i);
            Thread.sleep(1000);
            t.start();
        }
    }
 
    @Override
    public void run() {
//        System.out.println("Thread Name = " + Thread.currentThread().getName() + " default Formatter = " + formatter.get().toPattern());
        System.out.println("Thread Name = " + Thread.currentThread().getName() + " string = " + someString.get());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         
        someString.set("Changed value");

        System.out.println("Thread Name = " + Thread.currentThread().getName() + " string = " + someString.get());
    }
 
}