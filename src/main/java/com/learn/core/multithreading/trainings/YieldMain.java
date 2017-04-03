package com.learn.core.multithreading.trainings;

/**
 * Created by dmitry on 03.04.17.
 */
public class YieldMain {
  static int firstCount;
  static int secondCount;
  static int thirdCount;
  static int count = 130;
  private synchronized static void someStaticMethod() throws InterruptedException {

    String name = Thread.currentThread().getName();
    switch (name) {
      case "first":
        firstCount++;
        Thread.sleep(3000);
        break;
      case "second":
        secondCount++;
        break;
      default:
        thirdCount++;
        break;
    }
    if (count > 0) {
      count--;
    }
    System.out.println("in static - " + name);
    if (count > 0) {
      printStatistics();
    }
  }
  public static void main(String[] args) {
    Thread thread = new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          someStaticMethod();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        //        for (int i = 0; i<100; i++) {
//          if (i == 80) {
//            Thread.yield();
//          } else {
//            someStaticMethod();
//          }
//        }
      }
    }, "first");
    thread.start();
    Thread thread2 = new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          Thread.sleep(2000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
//        for (int i = 0; i<30; i++) {
        try {
          someStaticMethod();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
//        }
      }
    }, "second");
    thread2.setPriority(Thread.MIN_PRIORITY);
    thread2.start();

    Thread thread3 = new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          Thread.sleep(2000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
//        for (int i = 0; i<30; i++) {
        try {
          someStaticMethod();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
//        }
      }
    }, "third");
    thread3.setPriority(Thread.MAX_PRIORITY);
    thread3.start();
  }

  private static void printStatistics() {
    System.out.println(firstCount + ":" + secondCount + ":" + thirdCount);
  }
}
