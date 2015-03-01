package com.learn.core.multithreading.concurrency.cookbook.multuplying;

/**
 * Created by dmitry on 01.03.15.
 */
public class Calculator implements Runnable{
  private int number;

  public Calculator(int number) {
    this.number = number;
  }

  @Override
  public void run() {
    for (int i = 1; i <= 10; i++) {
      System.out.printf("%s: %d * %d = %d\n", Thread.
              currentThread().getName(), number, i, i * number);
    }
  }
}
