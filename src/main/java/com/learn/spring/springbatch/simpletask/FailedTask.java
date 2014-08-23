package com.learn.spring.springbatch.simpletask;

import org.apache.log4j.Logger;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

/**
 * Created with IntelliJ IDEA.
 * User: dmitriy.bilyk
 * Date: 29.07.13
 * Time: 21:17
 * To change this template use File | Settings | File Templates.
 */
public class FailedTask implements Tasklet {
   private final static Logger logger = Logger.getLogger(FailedTask.class);
   private String testMessage;

   public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception
   {
      logger.info(testMessage);
      return RepeatStatus.FINISHED;
   }

   public void setTestMessage(String testMessage)
   {
      this.testMessage = testMessage;
   }
}
