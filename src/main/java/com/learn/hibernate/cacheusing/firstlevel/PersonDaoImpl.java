package com.learn.hibernate.cacheusing.firstlevel;

import com.learn.hibernate.cacheusing.model.Person;
import com.learn.hibernate.cacheusing.utils.FirstLevelCashHibernateAnnotationUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by RUSLAN77 on  30.05.2018 in Ukraine
 */
@Transactional
public class PersonDaoImpl implements personDao {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public void doSomething() {

        Session sessionToSavePerson = sessionFactory.openSession();
        Person personToSave = new Person("dima3", "bilyk2", "Matrosova", "Gorlovka");
//        Transaction transaction = sessionToSavePerson.beginTransaction();
        sessionToSavePerson.save(personToSave);
//        sessionToSavePerson.
//        transaction.commit();
//        sessionToSavePerson.close();
//
//        Session session = FirstLevelCashHibernateAnnotationUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//        Person person = (Person) session.get(Person.class, 1);
//        Person person2 = (Person) session.get(Person.class, 1);
//        Person person3 = (Person) session.get(Person.class, 1);
        System.out.println(personToSave.getFirstName());
    }
}
