package com.learn.spring.propertyeditors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dmitry on 24.01.15.
 */
public class Main {
    public static void main(String[] args) {
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.custompropertyeditor/property-editor-context.xml");
            SomeClassWithPropertyEditors2 someBean = (SomeClassWithPropertyEditors2) applicationContext.getBean("domainNameTest2");
            System.out.println(someBean.getSomeClassWithPropertyEditors().getName());
    }
}
