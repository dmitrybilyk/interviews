package com.learn.web.springmvc.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by bid on 8/25/14.
 */
@Component
public class Student
{

   @Value("Dimonchik")
   private String name;

   @Value("33")
   private int age;

   public Student()
   {
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
}
