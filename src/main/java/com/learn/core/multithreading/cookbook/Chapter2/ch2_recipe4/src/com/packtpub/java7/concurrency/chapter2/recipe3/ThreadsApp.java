package com.learn.core.multithreading.cookbook.Chapter2.ch2_recipe4.src.com.packtpub.java7.concurrency.chapter2.recipe3;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadsApp {
 
    public static void main(String[] args) {
         
        CommonResource commonResource= new CommonResource();
        ReentrantLock locker = new ReentrantLock(); // создаем заглушку
        for (int i = 1; i < 6; i++){
             
            Thread t = new Thread(new CountThread(commonResource, locker));
            t.setName("Поток "+ i);
            t.start();
        }
    }
}
 
class CommonResource{
     
    int x=0;
}
 
class CountThread implements Runnable{
 
    CommonResource res;
    ReentrantLock locker;
    CountThread(CommonResource res, ReentrantLock lock){
        this.res=res;
        locker = lock;
    }
    public void run(){
        
		locker.lock(); // устанавливаем блокировку
        try{
            res.x=1;
            for (int i = 1; i < 5; i++){
                System.out.printf("%s %d \n", Thread.currentThread().getName(), res.x);
                res.x++;
                Thread.sleep(100);
            }
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        finally{
            locker.unlock(); // снимаем блокировку
        }
    }
}