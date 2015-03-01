package com.learn.core.multithreading.cookbook.Chapter1.ch1_recipe12.src.com.packtpub.java7.concurrency.chapter1.recipe12.task;

import java.util.concurrent.TimeUnit;

public class Task implements Runnable {

	@Override
	public void run() {
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
