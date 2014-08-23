package com.learn.spring.springbatch.todb.tasklet;

import org.apache.log4j.Logger;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

/**
 * Created with IntelliJ IDEA.
 * User: Buh
 * Date: 29.08.13
 * Time: 12:22
 * To change this template use File | Settings | File Templates.
 */
public class ReadParamsTasklet implements Tasklet {
   Logger logger = Logger.getLogger(ReadParamsTasklet.class);

   public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception
   {
      String value1 = String.valueOf(
              chunkContext.getStepContext().getStepExecution().getJobExecution().getExecutionContext().get("test1"));
      String value2 = String.valueOf(
              chunkContext.getStepContext().getStepExecution().getJobExecution().getExecutionContext().get("test2"));
      if (logger.isDebugEnabled())
      {
         logger.error("value1 is" + value1 + " and value2 is " + value2);
      }
      return RepeatStatus.FINISHED;
    }
}
