package com.learn.hibernate.cacheusing.firstlevel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: Buh
 * Date: 18.08.12
 * Time: 14:54
 * To change this template use File | Settings | File Templates.
 */
public class TestFirstLevel {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:/home/dmitry/dev/projects/interviews/src/main/resources/cacheusing/spring/spring-first-level-cache.xml");
        personDao personDao = (personDao) context.getBean("personDao");
        personDao.doSomething();
//        LocalSessionFactoryBean sessionFactory = (LocalSessionFactoryBean) context.getBean("sessionFactory");
}
}
