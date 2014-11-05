package com.batch.simon;

import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.listener.StepExecutionListenerSupport;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

/**
 * Created with IntelliJ IDEA.
 * User: dmitriy.bilyk
 * Date: 29.07.13
 * Time: 22:40
 * To change this template use File | Settings | File Templates.
 */
public class ParameterPrintTasklet
        extends StepExecutionListenerSupport
        implements Tasklet {

    private String message;

    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        System.out.println(message);
        return RepeatStatus.FINISHED;
    }

    public void beforeStep(StepExecution stepExecution) {
        JobParameters jobParameters = stepExecution.getJobParameters();
        message = jobParameters.getString("name");
    }

}