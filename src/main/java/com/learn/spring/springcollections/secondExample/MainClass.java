package com.learn.spring.springcollections.secondExample;

import com.learn.spring.springcollections.Customer;
import com.learn.spring.springcollections.PersonBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: dmitriy.bilyk
 * Date: 18.03.13
 * Time: 21:01
 * To change this template use File | Settings | File Templates.
 */
public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.collections/secondExample/collections-config.xml");

        JavaCollection jc=(JavaCollection)context.getBean("javaCollection");

        jc.getAddressList();
        jc.getAddressSet();
        jc.getAddressMap();
        jc.getAddressProp();
    }
}
