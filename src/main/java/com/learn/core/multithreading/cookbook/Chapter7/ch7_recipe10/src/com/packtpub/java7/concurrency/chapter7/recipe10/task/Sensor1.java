package com.learn.core.multithreading.cookbook.Chapter7.ch7_recipe10.src.com.packtpub.java7.concurrency.chapter7.recipe10.task;

import com.learn.core.multithreading.cookbook.Chapter7.ch7_recipe10.src.com.packtpub.java7.concurrency.chapter7.recipe10.task.ParkingCounter;

/**
 * Class that simulates a sensor in the doors of the parking
 *
 */
public class Sensor1 implements Runnable {

	/**
	 * Counter of cars in the parking
	 */
	private ParkingCounter counter;
	
	/**
	 * Constructor of the class. It initializes its attributes
	 * @param counter Counter of cars in the parking
	 */
	public Sensor1(ParkingCounter counter) {
		this.counter=counter;
	}
	

	/**
	 * Main method of the sensor. Simulates the traffic in the door of the parking
	 */
	@Override
	public void run() {
		counter.carIn();
		counter.carIn();
		counter.carIn();
		counter.carIn();
		counter.carOut();
		counter.carOut();
		counter.carOut();
		counter.carIn();
		counter.carIn();
		counter.carIn();
	}

}
