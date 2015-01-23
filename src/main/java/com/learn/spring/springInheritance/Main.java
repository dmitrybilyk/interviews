package com.learn.spring.springInheritance;

import com.learn.spring.springlifecycle.awareinterfaces.AwareInterfacesBean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dmitry on 22.01.15.
 */
public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] {"spring.inharitance/spring-inheritance.xml"});
        ParentClass parentBean = (ParentClass) applicationContext.getBean("parentBean");
//        ParentClass parentAbstractBean = (ParentClass) applicationContext.getBean("parentAbstractBean");
        System.out.println(parentBean.toString());
        ChildClass childBean = (ChildClass) applicationContext.getBean("childBean");
        System.out.println(childBean.getName()+childBean.getAge()+childBean.getHeight());

        applicationContext.close();
    }
}
