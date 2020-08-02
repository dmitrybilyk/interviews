package com.learn.interview_questions.Threads.jointest;

/**
 * Created by bid on 8/23/14.
 */
public class JoinTest
{
   public static void main(String[] args) throws InterruptedException
   {
      Thread thread = new Thread(new MyRunnable());
      thread.start();
      Thread.sleep(2000);
      thread.join();
      System.out.println("In main");
   }
}


class MyRunnable implements Runnable{

   @Override
   public void run()
   {

//         Thread.sleep(2000);

      MyRunnable2 myRunnable2 = new MyRunnable2();
      Thread thread = new Thread(myRunnable2);
      thread.start();

      try
      {
         thread.join();
         System.out.println("in " + this.getClass().getCanonicalName());
      }
      catch (InterruptedException e)
      {
         e.printStackTrace();
      }
   }
}

class MyRunnable2 implements Runnable{

   @Override
   public void run()
   {
      try
      {
         Thread.sleep(2000);
         System.out.println("in "+this.getClass().getCanonicalName());
      }
      catch (InterruptedException e)
      {
         e.printStackTrace();
      }
   }
}
