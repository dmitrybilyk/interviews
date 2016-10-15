package com.learn.spring.springlifecycle.initDestroyMethod;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dmitry on 22.01.15.
 */
public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] {"spring.lifecycle/lifecycle-context.xml"});
        InitMethodBean bean = (InitMethodBean) applicationContext.getBean("initMethodBean");
        System.out.println(bean.toString());

        applicationContext.close();
    }
}
