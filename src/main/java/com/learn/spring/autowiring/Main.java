package com.learn.spring.autowiring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dmitry on 24.01.15.
 */
public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("/spring.autowiring/autowiring-spring.xml");
        Employee employee=(Employee) context.getBean("employee");
        System.out.println(employee.getDepartmentInterface().getName());
    }
}
