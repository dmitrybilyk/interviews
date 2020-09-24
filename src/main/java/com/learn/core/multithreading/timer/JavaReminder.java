package com.learn.core.multithreading.timer;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class JavaReminder {
    Timer timer;
    ScheduledExecutorService executorService;

    public JavaReminder(int seconds) throws InterruptedException {
//        timer = new Timer();  //At this line a new Thread will be created
//        timer.scheduleAtFixedRate(new RemindTask(), seconds*1000, seconds*1000); //delay in milliseconds
        executorService = Executors.newScheduledThreadPool(1);
        executorService.scheduleAtFixedRate(new RemindExecutorTask(), 2, 2, TimeUnit.SECONDS);
        Thread.sleep(7000);
        executorService.shutdown();

        executorService.scheduleAtFixedRate(new RemindExecutorTask(), 2, 2, TimeUnit.SECONDS);
    }

    class RemindTask extends TimerTask {

        @Override
        public void run() {
//            System.out.println("ReminderTask is completed by Java timer");
            System.out.println("ReminderTask is completed by Executor");
//            timer.cancel(); //Not necessary because we call System.exit
            //System.exit(0); //Stops the AWT thread (and everything else)
        }
    }

class RemindExecutorTask extends Thread {

        @Override
        public void run() {
            System.out.println("ReminderTask is completed by Java timer");
//            timer.cancel(); //Not necessary because we call System.exit
            //System.exit(0); //Stops the AWT thread (and everything else)
        }
    }

    public static void main(String args[]) throws InterruptedException {
        System.out.println("Java timer is about to start");
        JavaReminder reminderBeep = new JavaReminder(5);
        System.out.println("Remindertask is scheduled with Java timer.");
    }
}


//Read more: https://javarevisited.blogspot.com/2013/02/what-is-timer-and-timertask-in-java-example-tutorial.html#ixzz6Wg3y33qj