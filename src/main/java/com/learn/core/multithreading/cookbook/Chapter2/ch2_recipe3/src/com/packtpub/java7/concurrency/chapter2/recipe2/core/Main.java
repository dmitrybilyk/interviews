package com.learn.core.multithreading.cookbook.Chapter2.ch2_recipe3.src.com.packtpub.java7.concurrency.chapter2.recipe2.core;

import com.learn.core.multithreading.cookbook.Chapter2.ch2_recipe3.src.com.packtpub.java7.concurrency.chapter2.recipe2.task.Consumer;
import com.learn.core.multithreading.cookbook.Chapter2.ch2_recipe3.src.com.packtpub.java7.concurrency.chapter2.recipe2.task.EventStorage;
import com.learn.core.multithreading.cookbook.Chapter2.ch2_recipe3.src.com.packtpub.java7.concurrency.chapter2.recipe2.task.Producer;

/**
 * Main class of the example
 */
public class Main {

	/**
	 * Main method of the example
	 */
	public static void main(String[] args) {
		
		// Creates an event storage
		EventStorage storage=new EventStorage();
		
		// Creates a Producer and a Thread to run it
		Producer producer=new Producer(storage);
		Thread thread1=new Thread(producer);

		// Creates a Consumer and a Thread to run it
		Consumer consumer=new Consumer(storage);
		Thread thread2=new Thread(consumer);
		
		// Starts the thread
		thread2.start();
		thread1.start();
	}

}
