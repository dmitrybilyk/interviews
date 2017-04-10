package com.learn.core.multithreading.cookbook.Chapter1.ch1_recipe05.src.com.packtpub.java7.concurrency.chapter1.recipe5.task;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Class that writes the actual date to a file every second
 * 
 */
public class FileClock implements Runnable {

	/**
	 * Main method of the class
	 */
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
//			if (!Thread.currentThread().isInterrupted()) {
//				try {
//					throw new InterruptedException();
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
			System.out.printf("%s\n", new Date());
			try {
				// Sleep during one second
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				System.out.printf("The FileClock has been interrupted");
			}
		}
	}
}
