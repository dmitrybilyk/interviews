package com.learn.spring.springbatch.todb.decider;

import com.learn.spring.springbatch.todb.LedgerDAO;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.job.flow.FlowExecutionStatus;
import org.springframework.batch.core.job.flow.JobExecutionDecider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created with IntelliJ IDEA.
 * User: Buh
 * Date: 29.08.13
 * Time: 13:02
 * To change this template use File | Settings | File Templates.
 */
public class SaveParamsDecider implements JobExecutionDecider {
   @Autowired
   @Qualifier("ledgerCriteriaDaoImpl")
   LedgerDAO ledgerCriteriaDaoImpl;

   public FlowExecutionStatus decide(JobExecution jobExecution, StepExecution stepExecution)
   {
      boolean isSave = jobExecution.getJobInstance().getJobParameters().getParameters().get("isSave") != null;
      if (isSave)
      {
         return FlowExecutionStatus.COMPLETED;
      }
      else
      {
         return FlowExecutionStatus.FAILED;
      }
   }
}
