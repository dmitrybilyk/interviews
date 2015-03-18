package com.learn.core.multithreading.cookbook.Chapter4.ownexecution;

import java.util.concurrent.TimeUnit;

/**
 * Created by dmitry on 18.03.15.
 */
public class MyRunnableTask implements Runnable {
  private final String taskName;

  public MyRunnableTask(String taskName) {
    this.taskName = taskName;
  }

  @Override
  public void run() {
    Long duration=(long)(Math.random()*2);
    System.out.printf("%s: Task %s: Doing a task during %d seconds\n",Thread.currentThread().getName(),taskName,duration);
    try {
      TimeUnit.SECONDS.sleep(duration);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
