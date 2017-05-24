package com.learn.core.multithreading.cookbook.Chapter4.ch4_recipe03.src.com.packtpub.java7.concurrency.chapter4.recipe3.trainings;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by dmitry on 17.05.17.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        long start = System.currentTimeMillis();
        List<Future<Integer>> futures = new ArrayList<>();
        for (int i = 0; i < 9999; i++) {
            AddCalculator addCalculator = new AddCalculator(3, 4);
            Future<Integer> result = threadPoolExecutor.submit(addCalculator);
            futures.add(result);
//            Thread thread = new Thread(addCalculator);
//            thread.start();
//            thread.join();
            System.out.println(System.currentTimeMillis() - start);
        }
        threadPoolExecutor.shutdown();

        for (Future<Integer> future : futures) {
            System.out.println(future.get());
        }

    }
}
