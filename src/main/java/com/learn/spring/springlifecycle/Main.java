package com.learn.spring.springlifecycle;

import com.learn.spring.springlifecycle.model.TestLifeCycleBean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by bid on 8/26/14.
 */
public class Main
{
   public static void main(String[] args)
   {
      AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] {"spring.lifecycle/lifecycle-context.xml"});
      TestLifeCycleBean testLifeCycleBean = (TestLifeCycleBean) applicationContext.getBean("testLifeCycleBean");
      System.out.println(testLifeCycleBean.getName());

      applicationContext.close();
   }
}
