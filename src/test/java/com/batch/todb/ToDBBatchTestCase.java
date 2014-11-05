package com.batch.todb;

import com.learn.spring.springbatch.todb.LedgerDAO;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.util.StopWatch;

import java.util.Date;
import java.util.Map;

@ContextConfiguration(locations = "classpath:com/batch/todb/contextToDB.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public class ToDBBatchTestCase {
   @Autowired
   private ApplicationContext context;

   @Autowired
   @Qualifier("ledgerCriteriaDaoImpl")
   private LedgerDAO ledgerCriteriaDaoImpl;

   private final static Logger logger = Logger
           .getLogger(ToDBBatchTestCase.class);

   @Autowired
   private JobLauncher launcher;

   @Autowired
   private Job job;
   private JobParameters jobParameters = new JobParameters();

   @Test
   public void testLaunchJob() throws Exception
   {
//		StopWatch sw = new StopWatch();
//		sw.start();
//        Here I'm adding job parameter to test them in job

      JobLauncher jobLauncher = context.getBean(JobLauncher.class);
      Job job = context.getBean(Job.class);
      jobLauncher.run(job, new JobParametersBuilder()
              .addString("inputFile", "file:./products.txt")
              .addDate("date", new Date())
              .addString("isSave", "IsSave")
              .addString("memberNameMask", "Person")
              .toJobParameters());

//		launcher.run(job, jobParameters);
//		sw.stop();
//		logger.info(">>> TIME ELAPSED:" + sw.prettyPrint());
   }

   @Test
   public void testTransactions()
   {
      ledgerCriteriaDaoImpl.testTransactions();
   }


}