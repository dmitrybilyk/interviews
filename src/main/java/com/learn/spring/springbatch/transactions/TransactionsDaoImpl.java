package com.learn.spring.springbatch.transactions;

import com.learn.spring.springbatch.todb.Ledger;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: dmitriy.bilyk
 * Date: 30.03.13
 * Time: 21:19
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class TransactionsDaoImpl implements TransactionsDao
{
    @Autowired
    SessionFactory sessionFactory;

    Transaction transaction = null;

    public List<Ledger> transMethod() {
        Session session = sessionFactory.getCurrentSession();
        transaction = session.beginTransaction();
        List<Ledger> ledgers = session.createQuery("from Ledger").list();
        transaction.commit();
        return ledgers;
    }

    public void editRandomRow() {
        int intValue = 5;
        Session session = sessionFactory.getCurrentSession();
        transaction = session.beginTransaction();
        Query query = session.createQuery("update Ledger l set l.comments = 'updated comment' where l.id= :intValue");
        query.setParameter("intValue", intValue);
        query.executeUpdate();
        transaction.commit();

    }

    public Ledger getLedgerById(int id) {
        Session session = sessionFactory.getCurrentSession();
        transaction = session.beginTransaction();
        Query query = session.createQuery("from Ledger l where l.id= :intValue");
        query.setParameter("intValue", id);
        Ledger ledger =(Ledger) query.uniqueResult();
        System.out.println(ledger.getComments());
        transaction.commit();
        return ledger;
    }
}
