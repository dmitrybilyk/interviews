package com.learn.core.multithreading.cookbook.Chapter3.ch3_recipe1.src.com.packtpub.java7.concurrency.chapter3.recipe1.core;

import com.learn.core.multithreading.cookbook.Chapter3.ch3_recipe1.src.com.packtpub.java7.concurrency.chapter3.recipe1.task.Job;
import com.learn.core.multithreading.cookbook.Chapter3.ch3_recipe1.src.com.packtpub.java7.concurrency.chapter3.recipe1.task.PrintQueue;

/**
 * Main class of the example.
 *
 */
public class Main {

	/**
	 * Main method of the class. Run ten jobs in parallel that
	 * send documents to the print queue at the same time.
	 */
	public static void main (String args[]){
		
		// Creates the print queue
		PrintQueue printQueue=new PrintQueue();
		
		// Creates ten Threads
		Thread thread[]=new Thread[10];
		for (int i=0; i<10; i++){
			thread[i]=new Thread(new Job(printQueue),"Thread "+i);
		}
		
		// Starts the Threads
		for (int i=0; i<10; i++){
			thread[i].start();
		}
	}

}