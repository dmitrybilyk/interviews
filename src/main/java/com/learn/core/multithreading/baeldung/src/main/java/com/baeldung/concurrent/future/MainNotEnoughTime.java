package com.learn.core.multithreading.baeldung.src.main.java.com.baeldung.concurrent.future;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class MainNotEnoughTime {
        private static final Logger LOG = LoggerFactory.getLogger(MainNotEnoughTime.class);
        private long start;

        private static SquareCalculator squareCalculator;
        public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
                ExecutorService executor = Executors.newSingleThreadExecutor();
                try {
                        squareCalculator = new SquareCalculator(Executors.newSingleThreadExecutor());

                        Future<Integer> result = squareCalculator.calculate(4);

                        result.get(500, TimeUnit.MILLISECONDS);
                } finally {
                        executor.shutdown();
                }
        }
}
