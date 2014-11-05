package com.learn.spring.springbatch.todb;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.batch.item.ItemProcessor;

/**
 * Created with IntelliJ IDEA.
 * User: Buh
 * Date: 29.08.13
 * Time: 17:19
 * To change this template use File | Settings | File Templates.
 */
public class ShowAllLedgersProcessor implements ItemProcessor {
   Logger logger = Logger.getLogger(ShowAllLedgersProcessor.class);

   public Object process(Object item) throws Exception
   {
      List<Ledger> ledgerList = (List<Ledger>) item;
      for (Ledger ledger : ledgerList)
      {
         logger.debug(ledger.getMemberName());
      }
      return null;
   }
}
