package com.learn.core.multithreading.trainings;

/**
 * Created by dmitry on 03.04.17.
 */
public class Main {
  private synchronized static void someMethod() throws InterruptedException {
    Thread.sleep(4000);
    System.out.println("some work is here by: " + Thread.currentThread().getName());
  }
  public static void main(String[] args) throws InterruptedException {
    final Thread thread = new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          someMethod();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println("some work of first thread");
      }
    }, "first thread");
    thread.start();


    Thread thread2 = new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          someMethod();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println("some work of second thread");
      }
    }, "second thread");
    thread2.start();

    Thread threadWhichWillJoinThread2 = new Thread(new Runnable() {
      @Override
      public void run() {
        try {
//          Thread.currentThread().join();
          thread.join();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println("Joined and completed");
//        System.out.println("some work of second thread");
      }
    }, "for join thread");
    threadWhichWillJoinThread2.start();
    thread2.start();


    Thread.sleep(1000);
    System.out.println(thread2.getState());
//    System.out.println(Thread.currentThread().getState());
  }
}
