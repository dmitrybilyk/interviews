package com.learn.core.multithreading.baeldung.src.main.java.com.baeldung.concurrent.future;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static org.junit.Assert.assertEquals;

public class Main {
        private static final Logger LOG = LoggerFactory.getLogger(Main.class);
        private long start;

        private static SquareCalculator squareCalculator;
        public static void main(String[] args) throws InterruptedException, ExecutionException {
                ExecutorService executor = Executors.newSingleThreadExecutor();
                try {
                        squareCalculator = new SquareCalculator(executor);

                        Future<Integer> result1 = squareCalculator.calculate(4);
                        Future<Integer> result2 = squareCalculator.calculate(1000);
//                        result1.cancel(true);
                        while (!result1.isDone() || !result2.isDone()) {
                                LOG.debug(String.format("Task 1 is %s and Task 2 is %s.",
                                        result1.isDone() ? "done" : "not done", result2.isDone() ? "done" : "not done"));

                                Thread.sleep(300);
                        }
                        System.out.println(result1.get().intValue());
                        System.out.println(result2.get().intValue());
                } finally {
                        executor.shutdown();
                }
        }
}
