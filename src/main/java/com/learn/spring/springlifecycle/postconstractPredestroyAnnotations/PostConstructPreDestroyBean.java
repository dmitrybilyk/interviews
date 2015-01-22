package com.learn.spring.springlifecycle.postconstractPredestroyAnnotations;

import com.google.common.base.MoreObjects;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by bid on 8/26/14.
 */
public class PostConstructPreDestroyBean {
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

   @PostConstruct
   public void postConstructMethod(){
      System.out.println("From Post Construct");
   }

   @PreDestroy
   public void preDestroyedMethod(){
      System.out.println("From Pre Destroyed");
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("name", name).add("age", age).toString();
   }

}
