package com.learn.core.multithreading.threads;

/**
 * Created by IntelliJ IDEA.
 * User: bilyk
 * Date: 02.07.12
 * Time: 18:17
 * To change this template use File | Settings | File Templates.
 */
/*
        Create New Thread Using Runnable Example

        This Java example shows how to create a new thread by implementing

        Java Runnable interface.
*/
/*
* To create a thread using Runnable, a class must implement
* Java Runnable interface.
*/

public class CreateThreadRunnableExample implements Runnable{
    /*
    * A class must implement run method to implement Runnable
    * interface. Signature of the run method is,
    *
    * public void run()
    *
    * Code written inside run method will constite a new thread.
    * New thread will end when run method returns.
    */

    public void run(){
        for(int i=0; i < 5; i++){
            System.out.println("Child Thread : " + i);
            try{
                Thread.sleep(50);
            }
            catch(InterruptedException ie){
                System.out.println("Child thread interrupted! " + ie);
            }
        }
        System.out.println("Child thread finished!");
    }

    public static void main(String[] args) {
        /*
        * To create new thread, use
        * Thread(Runnable thread, String threadName)
        * constructor.
        *
        */
        Thread t = new Thread(new CreateThreadRunnableExample(), "My Thread");
        /*
        * To start a particular thread, use
        * void start() method of Thread class.
        *
        * Please note that, after creation of a thread it will not start
        * running until we call start method.
        */
        t.start();

        for(int i=0; i < 5; i++){
            System.out.println("TurkeyMain thread : " + i);
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException ie){
                System.out.println("Child thread interrupted! " + ie);
            }
        }
        System.out.println("TurkeyMain thread finished!");
    }
}
/*
Typical output of this thread example would be
TurkeyMain thread : 0
Child Thread : 0
Child Thread : 1
TurkeyMain thread : 1
TurkeyMain thread : 2
Child Thread : 2
Child Thread : 3
TurkeyMain thread : 3
TurkeyMain thread : 4
Child Thread : 4
Child thread finished!
TurkeyMain thread finished!


*/
