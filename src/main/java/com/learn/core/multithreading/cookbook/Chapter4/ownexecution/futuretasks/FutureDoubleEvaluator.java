package com.learn.core.multithreading.cookbook.Chapter4.ownexecution.futuretasks;

import java.util.concurrent.Callable;

/**
 * Created by dmitry on 18.03.15.
 */
public class FutureDoubleEvaluator implements Callable<Integer> {
  private Integer result;

  public FutureDoubleEvaluator(Integer result) {
    this.result = result;
  }

  @Override
  public Integer call() throws Exception {
    return result *= 2;
  }
}
