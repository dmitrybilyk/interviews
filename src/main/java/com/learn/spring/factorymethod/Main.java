package com.learn.spring.factorymethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dmitry on 24.01.15.
 */
public class Main {
    public static void main(String[] args) {
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.factorymethod/spring-factorymethod.xml");
            SomeClassWithStaticInitializationMethod someBean = (SomeClassWithStaticInitializationMethod) applicationContext.getBean("someBean");
            System.out.println(someBean.getName());
    }
}
