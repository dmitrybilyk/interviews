package com.learn.spring.springlifecycle.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by bid on 8/26/14.
 */
public class TestLifeCycleBean implements InitializingBean, DisposableBean, ApplicationContextAware, BeanNameAware
{
   private String name;
   private int age;

   public TestLifeCycleBean()
   {
   }

   public TestLifeCycleBean(final String name, final int age)
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
   public void destroy() throws Exception
   {
      System.out.println("Destroyed with help of destroy of DisposableBean interface - " + name);
   }

   @Override
   public void afterPropertiesSet() throws Exception
   {
      System.out.println("Initialized with help of afterproperties set of InitializingBean interface - " + name);
   }

   @Override
   public void setApplicationContext(final ApplicationContext applicationContext) throws BeansException
   {
      System.out.println("AppContextAware is invoked" + "  app name is + " + applicationContext.getApplicationName());

   }

   @Override
   public void setBeanName(final String name)
   {
      System.out.println("SetBeanName is executing");
   }

   public void customInit(){
      System.out.println("Custom init method for " + name);
   }

   public void customDestroy(){
      System.out.println("Custom destroy method for " + name);
   }

   @PostConstruct
   public void customPostConstructInit()
   {
      System.out.println("Method customInit() invoked...");
   }

   @PreDestroy
   public void customPreDestroyDestroy()
   {
      System.out.println("Method customDestroy() invoked...");
   }

}
