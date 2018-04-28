package com.learn.core.multithreading.yieldtest;

/**
 * Created by bid on 8/23/14.
 */
public class YieldTest
{
   public static void main(String[] args)
   {
      for (int i = 0; i < 100; i++)
      {
         if (i==40) {
            try {
               Thread.sleep(1000);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
//            Thread.yield();
            Thread thread = new Thread(new Runnable(){

               @Override
               public void run()
               {
                  for (int i = 0; i < 100; i++){
                     System.out.println("I'm working" + i);
                  }
               }
            });
            thread.start();
         } else {
            System.out.println("do something" + i);
         }
      }
   }
}
