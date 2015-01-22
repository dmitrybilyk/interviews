package com.learn.spring.springlifecycle.initDestroyMethod;

import com.google.common.base.MoreObjects;

/**
 * Created by bid on 8/26/14.
 */
public class InitMethodBean {
   private String name;
   private int age;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("name", name).add("age", age).toString();
   }

   public void initMethod() {
      System.out.println("init method is working here");
   }

   public void destroyMethod() {
      System.out.println("Destroy method works!");
   }
}
