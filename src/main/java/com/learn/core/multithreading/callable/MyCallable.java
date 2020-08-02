package com.learn.core.multithreading.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by bid on 8/23/14.
 */
public class MyCallable implements Callable<Student>
{

   public static void main(String[] args) throws ExecutionException, InterruptedException
   {
      MyCallable myCallable = new MyCallable();
      ExecutorService executorService = Executors.newFixedThreadPool(10);

      List<Future<Student>> futureStudentsList = new ArrayList<Future<Student>>();

      for (int i = 0; i < 10; i++){
         Future<Student> futureStudent = executorService.submit(myCallable);
         futureStudentsList.add(futureStudent);
      }

      for (Future<Student> studentFuture : futureStudentsList)
      {
         System.out.println(studentFuture.get().getName());
      }

      System.out.println("this is next");

   }

   @Override
   public Student call() throws Exception
   {
      Student studentElement = new Student();
      studentElement.setName("Dimon" + new Random().nextInt(5));
      Thread.sleep(1000);

      return studentElement;
   }
}
