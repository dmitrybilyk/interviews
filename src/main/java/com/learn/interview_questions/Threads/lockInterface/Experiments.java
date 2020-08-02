package com.learn.interview_questions.Threads.lockInterface;

import java.util.ArrayList;
import java.util.List;

public class Experiments {
        public static void main(String[] args) {
                long startTime = System.currentTimeMillis();
                Car car = new Car();
//                Thread thread = new Thread(new Runnable() {
//                        @Override public void run() {
//                                PrintB(car);
//                        }
//                });
//                thread.start();
                CarCleanerWork target = new CarCleanerWork(car);

//                ExecutorService executor = Executors.newFixedThreadPool(10);
//                executor.submit(target);
                List<Thread> threads = new ArrayList<>();
                for (int i = 0; i < 10; i++) {
                        Thread thread = new Thread(target, "thread-"+i);
                        threads.add(thread);
                }
                for (Thread thread : threads) {
                        thread.start();
                        System.out.println("Thread started - " + thread.getName());
//                        try {
//                                thread.join();
//                        } catch (InterruptedException e) {
//                                e.printStackTrace();
//                        }
                }

                //                System.out.println("final value - " + car.getSomeValue());
                System.out.println(System.currentTimeMillis()-startTime);




        }
}

class Car {
        private List<Integer> someValue = new ArrayList<>();

        public List<Integer> getSomeValue() {
                return someValue;
        }

        public void setSomeValue(List<Integer> someValue) {
                this.someValue = someValue;
        }
}

class CarCleanerWork implements Runnable {
        private Car car;

        public CarCleanerWork(Car car) {
                this.car = car;
                for (int i = 0; i<10000; i++) {
                        car.getSomeValue().add(i);
                }

        }

        @Override public void run() {
                if (car.getSomeValue().size() <=0) {
                        System.out.println(Thread.currentThread().getName() + " nothing to do with 0");
                }
                for (int i = 0; i< 1000; i++) {
                        car.getSomeValue().remove(0);
                        System.out.println("Thread name - " + Thread.currentThread().getName() + " = " + car.getSomeValue().size());
                }
        }
}


