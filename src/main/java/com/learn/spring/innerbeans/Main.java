package com.learn.spring.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dmitry on 24.01.15.
 */
public class Main {
    public static void main(String[] args) {
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.innerbeans/spring-inner-beans.xml");
            SomeClass someClass = (SomeClass) applicationContext.getBean("someClass");
            System.out.println(someClass.getSomeOtherClass().getName2());
    }
}
