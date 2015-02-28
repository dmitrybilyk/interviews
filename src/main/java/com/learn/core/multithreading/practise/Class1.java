package com.learn.core.multithreading.practise;

/**
 * Created by dmitry on 28.02.15.
 */
public class Class1 {
  public static void main(String[] args) throws InterruptedException {
    Thread thread = new Thread(getRunnable(true, "some work from thread 1"), "thread1");
    Thread thread2 = new Thread(getRunnable(false, "some work from thread 2"), "thread2");
    Thread demonThread = new Thread(new DaemonThread(), "demonThread");
    demonThread.setDaemon(true);
    demonThread.start();
    thread.start();
    thread.join();
    thread2.start();
    thread2.join();
//    demonThread.join();
    System.out.println("test");
  }

  private static Runnable getRunnable(final boolean isToSleep, final String message) {
    return new Runnable() {
      @Override
      public void run() {
        if (isToSleep) {
          sleepThread();
        }
        System.out.println(message);
      }

      private void sleepThread() {
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    };
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
