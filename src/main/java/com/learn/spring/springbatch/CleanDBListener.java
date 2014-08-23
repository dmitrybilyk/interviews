package com.learn.spring.springbatch;

import com.learn.spring.springbatch.todb.LedgerDAO;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: dmitriy.bilyk
 * Date: 30.03.13
 * Time: 20:16
 * To change this template use File | Settings | File Templates.
 */
@Component("cleanDBListener")
public class CleanDBListener implements JobExecutionListener {
   @Autowired
   private LedgerDAO itemDAO;

   public void beforeJob(JobExecution jobExecution)
   {
      itemDAO.cleanDB();
   }

   public void afterJob(JobExecution jobExecution)
   {
      System.out.println("after job from listener");//To change body of implemented methods use File | Settings | File Templates.
   }
}
