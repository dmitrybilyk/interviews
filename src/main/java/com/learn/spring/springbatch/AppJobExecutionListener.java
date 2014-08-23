package com.learn.spring.springbatch;

import com.learn.spring.springbatch.todb.LedgerDAO;
import org.apache.log4j.Logger;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("appJobExecutionListener")
public class AppJobExecutionListener implements JobExecutionListener {
   @Autowired
   private LedgerDAO itemDAO;
   private final static Logger logger = Logger
           .getLogger(AppJobExecutionListener.class);

   public void afterJob(JobExecution jobExecution)
   {
      if (jobExecution.getStatus() == BatchStatus.COMPLETED)
      {
         logger.info("Job completed: " + jobExecution.getJobId());
      }
      else if (jobExecution.getStatus() == BatchStatus.FAILED)
      {
         logger.info("Job failed: " + jobExecution.getJobId());
      }
   }

   public void beforeJob(JobExecution jobExecution)
   {
      itemDAO.cleanDB();
      if (jobExecution.getStatus() == BatchStatus.COMPLETED)
      {
         logger.info("Job completed: " + jobExecution.getJobId());
		} else if (jobExecution.getStatus() == BatchStatus.FAILED) {
			logger.info("Job failed: " + jobExecution.getJobId());
		}
	}
}
