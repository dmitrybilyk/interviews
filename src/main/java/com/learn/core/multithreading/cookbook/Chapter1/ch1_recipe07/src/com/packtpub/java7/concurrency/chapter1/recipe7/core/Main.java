package com.learn.core.multithreading.cookbook.Chapter1.ch1_recipe07.src.com.packtpub.java7.concurrency.chapter1.recipe7.core;

import com.learn.core.multithreading.cookbook.Chapter1.ch1_recipe07.src.com.packtpub.java7.concurrency.chapter1.recipe7.event.Event;
import com.learn.core.multithreading.cookbook.Chapter1.ch1_recipe07.src.com.packtpub.java7.concurrency.chapter1.recipe7.task.CleanerTask;
import com.learn.core.multithreading.cookbook.Chapter1.ch1_recipe07.src.com.packtpub.java7.concurrency.chapter1.recipe7.task.WriterTask;

import java.util.ArrayDeque;
import java.util.Deque;


/**
 * Main class of the example. Creates three WriterTaks and a CleanerTask 
 *
 */
public class Main {

	/**
	 * Main method of the example. Creates three WriterTasks and a CleanerTask
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Creates the Event data structure
		Deque<Event> deque=new ArrayDeque<Event>();
		
		// Creates the three WriterTask and starts them
		WriterTask writer=new WriterTask(deque);
		for (int i=0; i<3; i++){
			Thread thread=new Thread(writer);
			thread.start();
		}
		
		// Creates a cleaner task and starts them
		CleanerTask cleaner=new CleanerTask(deque);
		cleaner.start();

	}

}
