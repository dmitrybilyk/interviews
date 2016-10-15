package com.learn.core.multithreading.cookbook.Chapter1.ch1_recipe09.src.com.packtpub.java7.concurrency.chapter1.recipe7.core;

import com.learn.core.multithreading.cookbook.Chapter1.ch1_recipe09.src.com.packtpub.java7.concurrency.chapter1.recipe7.task.UnsafeTask;

import java.util.concurrent.TimeUnit;


/**
 * Main class of the UnsafeTask. Creates a Runnable task and
 * three Thread objects that run it.
 *
 */
public class Main {

	/**
	 * Main method of the UnsafeTaks. Creates a Runnable task and
	 * three Thread objects that run it.
	 * @param args
	 */
	public static void main(String[] args) {
		// Creates the unsafe task
		UnsafeTask task=new UnsafeTask();
		
		// Throw three Thread objects
		for (int i=0; i<3; i++){
			Thread thread=new Thread(task);
			thread.start();
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
