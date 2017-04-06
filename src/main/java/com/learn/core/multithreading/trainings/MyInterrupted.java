package com.learn.core.multithreading.trainings;

/**
 * Created by dmitry on 04.04.17.
 */
//http://www.javatpoint.com/interrupting-a-thread
public class MyInterrupted {
  public static void main(String[] args) {
    Thread thread = new Thread(new Runnable() {
      @Override
      public void run() {
//        try {
        System.out.println(Thread.currentThread().getName());
        if (Thread.currentThread().isInterrupted()) {
          System.out.println("code for interrupted");
        } else {
          System.out.println("code for non-interrupted");
        }
//        try {
//          Thread.sleep(3000);
//        } catch (InterruptedException e) {
//          System.out.println("continue working now");
//        }
      }
    }, "first");
    thread.start();
//    thread.interrupt();
  }
}
