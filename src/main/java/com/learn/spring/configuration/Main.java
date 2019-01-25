package com.learn.spring.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/file_configuration/configuration.xml");
        ConfigurationBean configurationBean = (ConfigurationBean) context.getBean("configurationBean");
        System.out.println(configurationBean);
    }
}
