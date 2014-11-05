package com.learn.spring.springbatch.todb;

import org.springframework.transaction.annotation.Transactional;

public interface LedgerDAO {

	public void save(final Ledger note) throws Exception;

    void cleanDB();

    void testTransactions();

    @Transactional
    Ledger getLedgerByName(String ledgerName);
}
