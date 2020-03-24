package com.learn.commandline.newpack3;
//package newpack3;
//crete jar jar -cvf Pupil.jar Pupil.java

public class Pupil
{
   private int id;
   private String name;
   private int age;

   public Pupil()
   {
   }

   public Pupil(final int id, final String name, final int age)
   {
      this.id = id;
      this.name = name;
      this.age = age;
   }

   public int getId()
   {
      return id;
   }

   public void setId(final int id)
   {
      this.id = id;
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
