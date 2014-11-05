package com.learn.web.module;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * Created by bid on 8/24/14.
 */
public class Student implements HttpSessionBindingListener
{
   private String name;
   private int age;

   public Student(final String name, final int age)
   {
      this.name = name;
      this.age = age;
   }


   public String getName()
   {
      return name;
   }

   public void setName(final String name)
   {
      this.name = name;
   }

   public int getAge()
   {
      return age;
   }

   public void setAge(final int age)
   {
      this.age = age;
   }

   @Override
   public void valueBound(final HttpSessionBindingEvent event)
   {
      System.out.println("Object with name " + name + "is initialized");
   }

   @Override
   public void valueUnbound(final HttpSessionBindingEvent event)
   {
      System.out.println("Object with name " + name + "is destroyed");
   }
}
