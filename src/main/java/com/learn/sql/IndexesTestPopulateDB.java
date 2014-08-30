package com.learn.sql;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: flash
 * Date: 05.11.12
 * Time: 21:32
 * To change this template use File | Settings | File Templates.
 */
public class IndexesTestPopulateDB {
    public static void main(String[] args) {
        Session populateDBsession = HibernateAnnotationUtil.getSessionFactory().openSession();

        Transaction populateDBTransaction = null;
        try {
            populateDBTransaction = populateDBsession.beginTransaction();
            populateDB(populateDBsession);
            populateDBTransaction.commit();
        } catch (HibernateException e) {
            populateDBTransaction.rollback();
            e.printStackTrace();
        } finally {
            populateDBsession.close();
        }

    }


    public static void populateDB(Session session){
        Library schoolLibrary = new Library("SchoolLibrary");
//        Library collegeLibrary = new Library("CollegeLibrary");

        for (int i = 0; i < 10000; i++){

            Book book1 = new Book("n444ame1"+i + "444");
            session.save(book1);
        }

    }

}
