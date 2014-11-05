package com.learn.spring.springbatch.transactions;

import com.learn.spring.springbatch.todb.Ledger;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: dmitriy.bilyk
 * Date: 30.03.13
 * Time: 21:18
 * To change this template use File | Settings | File Templates.
 */

public interface TransactionsDao {
    public List<Ledger> transMethod();
    public void editRandomRow();
    public Ledger getLedgerById(int id);
}
