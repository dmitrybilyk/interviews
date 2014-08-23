package com.learn.spring.springbatch.simpletask;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class HelloTask implements Tasklet {

	private String taskStartMessage;

	public void setTaskStartMessage(String taskStartMessage) {
		this.taskStartMessage = taskStartMessage;
	}

	public RepeatStatus execute(StepContribution arg0, ChunkContext arg1)
			throws Exception {
		System.out.println(taskStartMessage);
        throw new Exception("special exception to go to fail step");
//		return RepeatStatus.FINISHED;
	}
}
