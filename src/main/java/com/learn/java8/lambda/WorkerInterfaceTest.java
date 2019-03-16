package com.learn.java8.lambda;

public class WorkerInterfaceTest {

    public static void execute(WorkerInterface worker) {
        worker.doSomeWork();
    }

    public static void main(String [] args) {

        for (int i = 0; i < 9; i++) {
            System.out.println(i);
        }

      // вызов метода doSomeWork через анонимный класс
      // (классический способ)
      execute(new WorkerInterface() {
            @Override
            public void doSomeWork() {
               System.out.println("Worker вызван через анонимный класс");
            }
        });

      // вызов метода doSomeWork через Lambda-выражения
      // (нововведение Java 8)
      execute( () -> System.out.println("Worker вызван через Lambda") );
    }

}