package com.learn.core.multithreading.cookbook.Chapter1.ch1_recipe04.src.com.packtpub.java7.concurrency.chapter1.recipe4.core;

import com.learn.core.multithreading.cookbook.Chapter1.ch1_recipe04.src.com.packtpub.java7.concurrency.chapter1.recipe4.task.FileSearch;

import java.util.concurrent.TimeUnit;


/**
 *  Main class of the example. Search for the autoexect.bat file
 *  on the Windows root folder and its subfolders during ten seconds
 *  and then, interrupts the Thread
 */
public class Main {

	/**
	 * Main method of the core. Search for the autoexect.bat file
	 * on the Windows root folder and its subfolders during ten seconds
	 * and then, interrupts the Thread
	 * @param args
	 */
	public static void main(String[] args) {
		// Creates the Runnable object and the Thread to run it
		FileSearch searcher=new FileSearch("/home/dmitry/","7.html");
		Thread thread=new Thread(searcher);
		
		// Starts the Thread
		thread.start();
		
		// Wait for ten seconds
		try {
			TimeUnit.SECONDS.sleep(1/1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// Interrupts the thread
		thread.interrupt();
	}

}
