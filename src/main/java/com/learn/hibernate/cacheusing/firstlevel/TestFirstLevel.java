package com.learn.hibernate.cacheusing.firstlevel;

import com.learn.hibernate.cacheusing.model.Person;
import com.learn.hibernate.cacheusing.utils.FirstLevelCashHibernateAnnotationUtil;
import com.learn.hibernate.cacheusing.utils.HibernateAnnotationUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 * User: Buh
 * Date: 18.08.12
 * Time: 14:54
 * To change this template use File | Settings | File Templates.
 */
public class TestFirstLevel {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("cacheusing/spring/spring-first-level-cache.xml");
        personDao personDao = (personDao) context.getBean("personDao");
        personDao.doSomething();
//        LocalSessionFactoryBean sessionFactory = (LocalSessionFactoryBean) context.getBean("sessionFactory");
}
}
