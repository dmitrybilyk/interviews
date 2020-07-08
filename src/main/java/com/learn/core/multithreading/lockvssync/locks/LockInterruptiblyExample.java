package com.learn.core.multithreading.lockvssync.locks;

import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import java.text.SimpleDateFormat;

public class LockInterruptiblyExample 
{
	private String resource = "Hello, World!";
    private Lock   lock;
	
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss  ");
    final  int  TIME_SLEEP = 7000;
    
    Thread thread1;
    Thread thread2;
    Thread thread3;
    
    LockInterruptiblyExample() 
	{
		lock = new ReentrantLock();
		thread1 = new Thread(new LockClass("first" , "Первый поток")); 
		thread2 = new Thread(new LockClass("second", "Второй поток"));
		thread3 = new Thread(new LockClass("third" , "Третий поток"));

		thread1.start();
    	try {
            Thread.sleep(400);
    		thread2.start();
    		thread3.start();
        } catch (InterruptedException e) {
        }
		
	    while (thread1.isAlive() || thread2.isAlive() || thread3.isAlive()) {
	    	try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\nЗавершение работы примера");
        System.exit(0);
	}
	
	void printMessage(final String msg)
	{
	    String text = sdf.format(new Date());
	    if (msg == null)
	    	text += resource;
	    else
	    	text += msg;
	    System.out.println(text);
	}
	
	class LockClass implements Runnable 
	{
		String name;
		String text;
	    public LockClass(final String name, final String text) {
	    	this.name = name;
			this.text = text;
		}
	     
	    @Override
	    public void run() 
	    {
	    	try {
	    		printMessage("Wait (" + name + ") ...");
	    		lock.lock();
	    	    try {
	            	Thread.sleep(2000);
	    	    	if (name.equalsIgnoreCase("first")) {
	    	    		printMessage("Прерывание второго потока");
	    	    		thread2.interrupt();
	    	    		thread2.join();
	    	    	}
	    	        // доступ к ресурсу
	            	resource = text;
	            	printMessage(null);
	            	Thread.sleep(TIME_SLEEP);
	    	    } finally {
		        	// Убираем блокировку
	    	    	lock.unlock();
	            	String text = name + " : завершил работу";
	            	printMessage(text);
	    	    }
	    	} catch (InterruptedException e) {
	    		printMessage(name + " : interrupted wait");
	    	}
	    }	
    }
	public static void main(String[] args) {
		new LockInterruptiblyExample();
	}
}
