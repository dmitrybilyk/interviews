package com.learn.core.multithreading.waitandnotify.custom;

/**
 * Created by bid on 8/23/14.
 */
public class TemplateEnchancer implements Runnable
{
   private final Template template;

   public TemplateEnchancer(final Template template)
   {
      this.template = template;
   }

   public void enchance(){
      System.out.println("I'm enchancing the template");
   }

   @Override
   public void run()
   {
      try
      {
         Thread.sleep(1000);
         synchronized (template){
            template.setStructure("Enchanced structure");
            template.notify();
            System.out.println("Double-enchanced structer");
            template.setStructure("Double-enchanced structer");
         }
      }
      catch (InterruptedException e)
      {
         e.printStackTrace();
      }

   }
}
