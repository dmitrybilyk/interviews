package com.learn.spring.lookupmethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dmitry on 8/29/14.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("file:/home/dmitry/dev/projects/interviews/src/main/resources/spring.lookupmethod/lookup-method-context.xml");
        SingletonClass singletonClass = (SingletonClass) applicationContext.getBean("singleton");
        SingletonClass singletonClass2 = (SingletonClass) applicationContext.getBean("singleton");
        singletonClass.printDescription();
        singletonClass.printDescription();
    }
}
