package com.learn.core.multithreading.interruptmethod;

import java.util.logging.Logger;

/**
 * Created by bid on 8/23/14.
 */
public class CustomInterrupt
{
   static Logger logger = Logger.getLogger(CustomInterrupt.class.getName());

   public static void main(String[] args)
   {
//      Thread.currentThread().interrupt();
      try
      {
         Thread.sleep(1000);
      }
      catch (InterruptedException e)
      {
         logger.warning("The thread is marked as interrupted. You can't make it sleeps");
      }
   }
}
