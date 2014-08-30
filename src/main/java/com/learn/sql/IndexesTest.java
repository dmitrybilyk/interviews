package com.learn.sql;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: flash
 * Date: 05.11.12
 * Time: 21:32
 * To change this template use File | Settings | File Templates.
 */
public class IndexesTest {
    public static void main(String[] args) {
        Session getSession = HibernateAnnotationUtil.getSessionFactory().openSession();

        Transaction getTransaction = null;
        try {
            getTransaction = getSession.beginTransaction();
            long start = new Date().getTime();


            Query query = getSession.createQuery("from com.learn.sql.Book b where b.name like '%name1443%'");

            Book book = (Book) query.uniqueResult();
            System.out.println(book.getName());

            long end = new Date().getTime();
            System.out.println(end - start);
            getTransaction.commit();
        } catch (HibernateException e) {
            getTransaction.rollback();
            e.printStackTrace();
        } finally {
            getSession.close();
        }

    }

}
