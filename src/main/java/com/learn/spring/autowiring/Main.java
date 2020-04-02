package com.learn.spring.autowiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dmitry on 24.01.15.
 */
public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(CarDriverConfiguration.class);
//        AbstractApplicationContext context = new ClassPathXmlApplicationContext("file:/home/dmitry/dev/projects/interviews/src/main/resources/spring.autowiring/autowiring-spring.xml");
        Car car=(Car) context.getBean("goodCar");
        car.ride();
    }
}
