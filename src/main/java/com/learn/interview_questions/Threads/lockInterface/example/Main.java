package com.learn.interview_questions.Threads.lockInterface.example;

public class Main {
    static int u = 10000;
    public static void main(String[] args) throws InterruptedException {
//        List<Object> list = new ArrayList<>();

        Runnable action = () -> {
            for(int i = 0; i<3000; i++) {
                u--;
                System.out.println("u is decreased - " + u + " by " + Thread.currentThread().getName());
            }
            System.out.println("u is over - " + u + " by " + Thread.currentThread().getName());
//            for (int i = 0; i < 10000; i++) {
//                list.add(new Object());
//                System.out.println("done by - " + Thread.currentThread().getName());
//            }
        };

        Thread thread1 = new Thread(action, "tread-1");
//        thread1.setDaemon(true); // don't keep JVM alive

        Thread thread2 = new Thread(action, "thread-2");
//        thread2.setDaemon(true); // don't keep JVM alive

        thread1.start();
        thread2.start();

//        Thread.sleep(1_000L);
    }
}
