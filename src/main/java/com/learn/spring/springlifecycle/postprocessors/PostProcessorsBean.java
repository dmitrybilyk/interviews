package com.learn.spring.springlifecycle.postprocessors;

import com.google.common.base.MoreObjects;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by bid on 8/26/14.
 */
public class PostProcessorsBean implements BeanPostProcessor {
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

   @Override
   public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
      System.out.println("BeforeInitialization : " + beanName);
      return bean;  // you can return any other object as wellreturn null;
   }

   @Override
   public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
      System.out.println("AfterInitialization : " + beanName);
      return bean;  // you can return any other object as well
   }
}
