package com.learn.interview_questions.Threads.waitandnotify.custom;

/**
 * Created by bid on 8/23/14.
 */
public class Main
{
   public static void main(String[] args)
   {

      Template template = new Template();

      TemplateSender templateSender = new TemplateSender(template);
      new Thread(templateSender).start();

      TemplateEnchancer templateEnchancer = new TemplateEnchancer(template);
      new Thread(templateEnchancer).start();

   }
}
