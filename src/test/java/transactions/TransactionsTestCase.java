package transactions;

import com.learn.spring.springbatch.transactions.TransactionsDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with IntelliJ IDEA.
 * User: dmitriy.bilyk
 * Date: 30.03.13
 * Time: 21:11
 * To change this template use File | Settings | File Templates.
 */
@ContextConfiguration(locations = "classpath:transactions/transactions.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TransactionsTestCase {
    public void setTransactionsDaoImpl(TransactionsDao transactionsDaoImpl) {
        this.transactionsDaoImpl = transactionsDaoImpl;
    }

   @Autowired
   private TransactionsDao transactionsDaoImpl;

   @Test
   public void testTransactions()
   {
      System.out.println(transactionsDaoImpl.transMethod().size());

   }
}
