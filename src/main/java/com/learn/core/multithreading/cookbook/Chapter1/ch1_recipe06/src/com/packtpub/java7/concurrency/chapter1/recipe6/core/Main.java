package com.learn.core.multithreading.cookbook.Chapter1.ch1_recipe06.src.com.packtpub.java7.concurrency.chapter1.recipe6.core;

import com.learn.core.multithreading.cookbook.Chapter1.ch1_recipe06.src.com.packtpub.java7.concurrency.chapter1.recipe6.task.DataSourcesLoader;
import com.learn.core.multithreading.cookbook.Chapter1.ch1_recipe06.src.com.packtpub.java7.concurrency.chapter1.recipe6.task.NetworkConnectionsLoader;

import java.util.Date;


/**
 * Main class of the Example. Create and start two initialization tasks
 * and wait for their finish
 *
 */
public class Main {

	/**
	 * Main method of the class. Create and start two initialization tasks
	 * and wait for their finish
	 * @param args
	 */
	public static void main(String[] args) {

		// Creates and starts a DataSourceLoader runnable object
		DataSourcesLoader dsLoader = new DataSourcesLoader();
		Thread thread1 = new Thread(dsLoader,"DataSourceThread");
		thread1.start();

		// Creates and starts a NetworkConnectionsLoader runnable object
		NetworkConnectionsLoader ncLoader = new NetworkConnectionsLoader();
		Thread thread2 = new Thread(ncLoader,"NetworkConnectionLoader");
		thread2.start();

		// Wait for the finalization of the two threads
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Waits a message
		System.out.printf("Main: Configuration has been loaded: %s\n",new Date());
	}
}
