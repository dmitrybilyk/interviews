package com.learn.core.multithreading.baeldung.executors;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Main {
        public static void main(String[] args) throws ExecutionException, InterruptedException {

                ExecutorService executorService = Executors.newSingleThreadExecutor();
                Future<String> future = executorService.submit(new MyCallable());
                System.out.println(future.get());
                Map<String, String> map = Collections.synchronizedMap(new HashMap<>());
                map.put("1", "ddd");
                ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
                concurrentHashMap.put("3", "ggg");
        }
}

class MyRunnable implements Runnable {

        @Override public void run() {
                try {
                        Thread.sleep(1000);
                        System.out.println("Executed runnable");
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }
        }
}
class MyLongRunnable implements Runnable {

        @Override public void run() {
                try {
                        Thread.sleep(2000);
                        System.out.println("Executed long runnable");
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }
        }
}

class MyCallable implements Callable<String> {

        @Override public String call() throws Exception {
                Thread.sleep(900);
                System.out.println("Executed callable");
                return "Some result";
        }
}
