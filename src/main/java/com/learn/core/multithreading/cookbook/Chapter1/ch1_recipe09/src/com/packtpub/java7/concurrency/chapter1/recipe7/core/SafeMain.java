package com.learn.core.multithreading.cookbook.Chapter1.ch1_recipe09.src.com.packtpub.java7.concurrency.chapter1.recipe7.core;

import com.learn.core.multithreading.cookbook.Chapter1.ch1_recipe09.src.com.packtpub.java7.concurrency.chapter1.recipe7.task.SafeTask;

import java.util.concurrent.TimeUnit;


/**
 * Main class of the example.
 *
 */
public class SafeMain {

	/**
	 * Main method of the example
	 * @param args
	 */
	public static void main(String[] args) {
		// Creates a task
		SafeTask task=new SafeTask();
		
		// Creates and start three Thread objects for that Task
		for (int i=0; i<3; i++){
			Thread thread=new Thread(task);
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			thread.start();
		}

	}

}
