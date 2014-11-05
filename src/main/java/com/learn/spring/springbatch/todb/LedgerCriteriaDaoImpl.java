package com.learn.spring.springbatch.todb;

import com.learn.spring.springbatch.SpringBatchHibernateAnnotationUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: Buh
 * Date: 29.08.13
 * Time: 13:29
 * To change this template use File | Settings | File Templates.
 */
@Primary
@Repository
public class LedgerCriteriaDaoImpl implements LedgerDAO
{
    public void save(Ledger note) throws Exception {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void cleanDB() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void testTransactions() {
        //To change body of implemented methods use File | Settings | File Templates.
    }


    public Ledger getLedgerByName(String ledgerName) {
        Session session = SpringBatchHibernateAnnotationUtil.getSessionFactory().getCurrentSession();
        Criteria criteria = session.createCriteria(Ledger.class);
        criteria.add(Restrictions.eq("memberName", ledgerName));
        Ledger ledger = (Ledger) criteria.uniqueResult();
        return ledger;
    }
}
