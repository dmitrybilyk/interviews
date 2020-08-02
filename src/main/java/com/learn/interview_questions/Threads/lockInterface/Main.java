package com.learn.interview_questions.Threads.lockInterface;

/**
 * Created by bid on 8/23/14.
 */
public class Main
{
   public static void main(String[] args)
   {
//      SynchronizedLockExample synchronizedLockExample = new SynchronizedLockExample(new Resource());
      ConcurrencyLockExample synchronizedLockExample = new ConcurrencyLockExample(new Resource());
      Thread thread = new Thread(synchronizedLockExample);
      thread.start();

   }
}
