package com.learn.spring.springinaction.aspects;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dmitry on 05.05.14.
 */
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context
                = new ClassPathXmlApplicationContext(
                "aspects.xml");
        context.registerShutdownHook();
//    }

//    ApplicationContext context = new ClassPathXmlApplicationContext("/springinaction/aspects.xml");
        Human human = (Human) context.getBean("human");
        human.act();
    }

}
