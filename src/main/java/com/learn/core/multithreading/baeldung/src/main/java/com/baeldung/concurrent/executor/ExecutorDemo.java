package com.learn.core.multithreading.baeldung.src.main.java.com.baeldung.concurrent.executor;

import java.util.concurrent.Executor;

public class ExecutorDemo {

	public void execute() {
		Executor executor = new Invoker();
		executor.execute(()->{
			// task to be performed
		});
	}

}
