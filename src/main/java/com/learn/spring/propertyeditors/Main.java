package com.learn.spring.propertyeditors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dmitry on 24.01.15.
 */
public class Main {
    public static void main(String[] args) {
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.factorymethod/spring-factorymethod.xml");
            SomeClassWithPropertyEditors someBean = (SomeClassWithPropertyEditors) applicationContext.getBean("someBean");
            System.out.println(someBean.getName());
    }
}
