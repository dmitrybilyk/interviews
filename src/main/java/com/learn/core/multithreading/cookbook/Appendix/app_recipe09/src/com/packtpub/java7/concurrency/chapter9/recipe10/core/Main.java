package com.learn.core.multithreading.cookbook.Appendix.app_recipe09.src.com.packtpub.java7.concurrency.chapter9.recipe10.core;

import com.learn.core.multithreading.cookbook.Appendix.app_recipe09.src.com.packtpub.java7.concurrency.chapter9.recipe10.task.Task;

import java.util.concurrent.locks.ReentrantLock;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ReentrantLock lock=new ReentrantLock();
		for (int i=0; i<10; i++) {
			Task task=new Task(lock);
			Thread thread=new Thread(task);
			thread.start();
		}
	}

}
