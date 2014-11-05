package com.batch.simon;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

/**
 * Created with IntelliJ IDEA.
 * User: dmitriy.bilyk
 * Date: 29.07.13
 * Time: 22:11
 * To change this template use File | Settings | File Templates.
 */
public class PrintTasklet implements Tasklet {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
        System.out.print(message);
        return RepeatStatus.FINISHED;
    }



}