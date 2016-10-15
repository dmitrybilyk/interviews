package com.learn.core.multithreading.cookbook.Chapter7.ch7_recipe03.src.com.packtpub.java7.concurrency.chapter7.recipe03.core;

import com.learn.core.multithreading.cookbook.Chapter7.ch7_recipe03.src.com.packtpub.java7.concurrency.chapter7.recipe03.task.MyTask;
import com.learn.core.multithreading.cookbook.Chapter7.ch7_recipe03.src.com.packtpub.java7.concurrency.chapter7.recipe03.task.MyThreadFactory;

/**
 * Main class of the example. Creates a factory, a MyThread object to execute a Task object
 * and executes the Thread
 * 	
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		/*
		 * Create a Factory
		 */
		MyThreadFactory myFactory=new MyThreadFactory("MyThreadFactory");
	
		/*
		 * Crate a Task
		 */
		MyTask task=new MyTask();
		
		/*
		 * Create a Thread using the Factory to execute the Task
		 */
		Thread thread=myFactory.newThread(task);
		
		/*
		 * Start the Thread
		 */
		thread.start();
		
		/*
		 * Wait for the finalization of the Thread
		 */
		thread.join();
		
		/*
		 * Write the thread info to the console
		 */
		System.out.printf("Main: Thread information.\n");
		System.out.printf("%s\n",thread);
		System.out.printf("Main: End of the example.\n");

	}

}
