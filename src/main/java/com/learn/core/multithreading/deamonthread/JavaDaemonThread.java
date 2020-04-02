package com.learn.core.multithreading.deamonthread;


//Daemon threads are terminated by the JVM when there are no longer any user threads running,
// including the main thread of execution.
public class JavaDaemonThread {
 
    public static void main(String[] args) throws InterruptedException {
        Thread dt = new Thread(new DaemonThread(), "dt");
        Thread ndt = new Thread(new NonDaemonThread(), "ndt");
        dt.setDaemon(true);
        dt.start();
        ndt.start();
        //continue program
        Thread.sleep(5000);
        System.out.println("Finishing program");
    }
 
}
 
class DaemonThread implements Runnable{
 
    @Override
    public void run() {
        while(true){
            processSomething();
        }
    }
 
    private void processSomething() {
        try {
            System.out.println("Processing daemon thread");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
     
}

class NonDaemonThread implements Runnable{

    @Override
    public void run() {
        while(true){
            processSomething();
        }
    }

    private void processSomething() {
        try {
            System.out.println("Processing non-daemon thread");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}