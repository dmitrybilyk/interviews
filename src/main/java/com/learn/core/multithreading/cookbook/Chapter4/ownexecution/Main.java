package com.learn.core.multithreading.cookbook.Chapter4.ownexecution;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by dmitry on 18.03.15.
 */
public class Main {
  public static void main(String[] args) {
    /**
     * Constructor of the class. Creates the executor object
     */
    ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
    for (int i=0; i<100; i++) {
      MyRunnableTask myRunnableTask = new MyRunnableTask("Task " + i);
      executor.execute(myRunnableTask);
    }
    executor.shutdown();
  }
}
