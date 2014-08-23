package com.learn.core.multithreading.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by bid on 8/23/14.
 */
public class MyCallable implements Callable<Student>
{

   public static void main(String[] args)
   {
      MyCallable myCallable = new MyCallable();
      ExecutorService executorService = Executors.newFixedThreadPool(10);
   }

   @Override
   public Student call() throws Exception
   {
      Student studentElement = new Student();
      studentElement.setName("Dimon");

      return studentElement;
   }
}
