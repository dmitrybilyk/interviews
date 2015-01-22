package com.learn.spring.springlifecycle.awareinterfaces;

import com.google.common.base.MoreObjects;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;

/**
 * Created by bid on 8/26/14.
 */
public class AwareInterfacesBean implements BeanNameAware, BeanFactoryAware{
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

   @Override
   public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
      System.out.println(beanFactory.toString());
   }

   @Override
   public void setBeanName(String beanName) {
      System.out.println(beanName);
   }
}
