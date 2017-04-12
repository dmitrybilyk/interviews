package com.learn.core.multithreading.cookbook.Chapter1.ch1_recipe07.src.com.packtpub.java7.concurrency.chapter1.recipe7.task;

import com.learn.core.multithreading.cookbook.Chapter1.ch1_recipe07.src.com.packtpub.java7.concurrency.chapter1.recipe7.event.Event;

import java.util.Date;
import java.util.Deque;


/**
 * Class that reviews the Event data structure and deletes
 * the events older than ten seconds
 *
 */
public class CleanerTask extends Thread {

	/**
	 * Data structure that stores events
	 */
	private Deque<Event> deque;

	/**
	 * Constructor of the class
	 * @param deque data structure that stores events
	 */
	public CleanerTask(Deque<Event> deque) {
		this.deque = deque;
		// Establish that this is a Daemon Thread
		setDaemon(true);
	}


	/**
	 * Main method of the class
	 */
	@Override
	public void run() {
		while (true) {
			Date date = new Date();
			clean(date);
		}
	}

	/**
	 * Method that review the Events data structure and delete
	 * the events older than ten seconds
	 * @param date
	 */
	private void clean(Date date) {
		long difference;
		boolean delete;
		
		if (deque.size()==0) {
			return;
		}
		
		delete=false;
		do {
			Event e = deque.getLast();
			difference = date.getTime() - e.getDate().getTime();
			if (difference > 10000) {
				System.out.printf("Cleaner: %s\n",e.getEvent());
				deque.removeLast();
				delete=true;
			}	
		} while (difference > 10000);
		if (delete){
			System.out.printf("Cleaner: Size of the queue: %d\n",deque.size());
		}
	}
}
