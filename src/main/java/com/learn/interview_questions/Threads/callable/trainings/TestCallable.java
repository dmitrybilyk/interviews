package com.learn.interview_questions.Threads.callable.trainings;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by dmitry on 25.03.17.
 */
public class TestCallable implements Callable<Player> {
    @Override
    public Player call() throws Exception {
        Thread.sleep(2000);
        return new Player("Dima", 35);
    }

    public static void main(String[] args) {
        List<Future<Player>> futureList = new ArrayList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        futureList.add(executorService.submit(new TestCallable()));
        futureList.add(executorService.submit(new TestCallable()));
        TestCallable task = new TestCallable();
        Future<Player> playerFuture = executorService.submit(task);
        futureList.add(playerFuture);
        futureList.add(executorService.submit(new TestCallable()));
        futureList.add(executorService.submit(new TestCallable()));
        try {
            for (Future<Player> future : futureList) {
                System.out.println(playerFuture.isDone());
                System.out.printf(future.get().getName());
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }
}
