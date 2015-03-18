package com.learn.core.multithreading.cookbook.Chapter4.ownexecution.futuretasks;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by dmitry on 18.03.15.
 */
public class Main {
  public static void main(String[] args) {
    ThreadPoolExecutor executor=(ThreadPoolExecutor) Executors.newFixedThreadPool(2);
    List<Future<Integer>> resultList=new ArrayList<>();

    for (int i=0; i<10; i++) {
      FutureDoubleEvaluator futureDoubleEvaluator = new FutureDoubleEvaluator(i);
      Future<Integer> result = executor.submit(futureDoubleEvaluator);
      resultList.add(result);
    }

    do {
      for (int i = 0; i<resultList.size(); i++) {
        Future<Integer> future = resultList.get(i);
        try {
          Integer result = future.get();
          System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
          e.printStackTrace();
        }
      }
    } while(executor.getCompletedTaskCount() < resultList.size());
    executor.shutdown();
  }
}
