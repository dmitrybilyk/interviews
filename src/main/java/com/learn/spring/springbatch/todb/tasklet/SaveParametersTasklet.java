package com.learn.spring.springbatch.todb.tasklet;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

/**
 * Created with IntelliJ IDEA.
 * User: Buh
 * Date: 29.08.13
 * Time: 12:20
 * To change this template use File | Settings | File Templates.
 */
public class SaveParametersTasklet implements Tasklet{
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        chunkContext.getStepContext().getStepExecution().getJobExecution().getExecutionContext().put("test1", "test1");
        chunkContext.getStepContext().getStepExecution().getJobExecution().getExecutionContext().put("test2", "test2");
        return RepeatStatus.FINISHED;
    }
}
