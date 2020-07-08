package com.learn.core.multithreading;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
 
public class Processor {
 
    public static final int STR_COUNT = 100;
    public static final int TASK_COUNT = 10000;
 
    public static void main(String[] args) {
        {
            BigTaskOneThread bt = new BigTaskOneThread();
            long d1 = System.currentTimeMillis();
            Long result = bt.startTask();
            long d2 = System.currentTimeMillis();
            System.out.println(result + ", Time 1:" + (d2 - d1));
        }
        {
            BigTaskManyThreads bt = new BigTaskManyThreads();
            long d1 = System.currentTimeMillis();
            Long result = bt.startTask();
            long d2 = System.currentTimeMillis();
            System.out.println(result + ", Time 2:" + (d2 - d1));
        }
    }
 
    public Long process() {
        Long summa = 0L;
 
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < Processor.TASK_COUNT; i++) {
            String g = new BigInteger(500, random).toString(32);
            for (char c : g.toCharArray()) {
                summa += c;
            }
        }
        return summa;
    }
}
 
class BigTaskOneThread {
 
    public Long startTask() {
        Long summa = 0L;
        for (int i = 0; i < Processor.STR_COUNT; i++) {
            Processor p = new Processor();
            summa += p.process();
        }
        return summa;
    }
 
}
 
class BigTaskManyThreads {
 
    public Long startTask() {
        int ap = Runtime.getRuntime().availableProcessors();
        ExecutorService es = Executors.newFixedThreadPool(ap);
 
        Long summa = 0L;
        try {
            List<MyCallable> threads = new ArrayList<MyCallable>();
            for (int i = 0; i < Processor.STR_COUNT; i++) {
                threads.add(new MyCallable());
            }
            List<Future<Long>> result = es.invokeAll(threads);
 
            for (Future<Long> f : result) {
                summa += f.get();
            }
            es.shutdown();
        } catch (InterruptedException | ExecutionException ex) {
            ex.printStackTrace(System.out);
        }
        return summa;
    }
}
 
class MyCallable implements Callable<Long> {
 
    @Override
    public Long call() throws Exception {
        Processor p = new Processor();
        return p.process();
    }
}
