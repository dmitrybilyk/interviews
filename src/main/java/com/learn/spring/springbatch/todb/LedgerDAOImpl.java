package com.learn.spring.springbatch.todb;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Qualifier
public class LedgerDAOImpl implements LedgerDAO {
   Logger logger = Logger.getLogger(LedgerDAOImpl.class);

   @Autowired
   private JdbcTemplate jdbcTemplate;

   @Transactional(propagation = Propagation.SUPPORTS)
   public void save(final Ledger item) throws Exception
   {
      if (item.getMemberName().equalsIgnoreCase("Person7"))
      {
         logger.error(item.getMemberName() + " is failing");
         throw new Exception(item.getMemberName());
      }
      jdbcTemplate
              .update("insert into ledger.ledger (rcv_dt, mbr_nm, chk_nbr, chk_dt, pymt_typ, dpst_amt, pymt_amt, comments) values(?,?,?,?,?,?,?,?)",
                      new PreparedStatementSetter()
                      {
                         public void setValues(PreparedStatement stmt)
                                 throws SQLException
                         {
                            stmt.setDate(1, new java.sql.Date(item
                                                                      .getReceiptDate().getTime()));
                            stmt.setString(2, item.getMemberName());
								stmt.setString(3, item.getCheckNumber());
								stmt.setDate(4, new java.sql.Date(item
										.getCheckDate().getTime()));
								stmt.setString(5, item.getPaymentType());
								stmt.setDouble(6, item.getDepositAmount());
								stmt.setDouble(7, item.getPaymentAmount());
								stmt.setString(8, item.getComments());
							}
						});
	}

    public void cleanDB() {
        jdbcTemplate.execute("delete from ledger.ledger");
    }

    public void testTransactions() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public Ledger getLedgerByName(String ledgerName) {
        return  null;
    }
}
