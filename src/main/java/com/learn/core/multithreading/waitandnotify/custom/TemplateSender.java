package com.learn.core.multithreading.waitandnotify.custom;

/**
 * Created by bid on 8/23/14.
 */
public class TemplateSender implements Runnable
{
   private Template template;

   public TemplateSender(final Template template)
   {
      this.template = template;
   }

   public void receive(){
      System.out.println("I'm receiving a template!");
   }

   public void send(){
      System.out.println("I'm sending a template!");
   }

   @Override
   public void run()
   {
//      receive();

      synchronized (template){
               try
               {
                     template.wait();
               }
               catch (InterruptedException e)
               {
                  e.printStackTrace();
               }
      }
//      send();
   }
}
