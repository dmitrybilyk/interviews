package com.learn.core.multithreading.lockvssync.locks;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
 
public class ReentrantLockExample
{
	private String resource = "Hello, World!";
    private Lock   lock;
	
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss  ");
    final  int  TIME_WAIT  = 7000;
    final  int  TIME_SLEEP = 5000;
    
    Thread thread1;
    Thread thread2;
    
	ReentrantLockExample() 
	{
		lock = new ReentrantLock();
		thread1 = new Thread(new LockClass("first" , "Первый поток")); 
		thread2 = new Thread(new LockClass("second", "Второй поток"));

		thread1.start();
		thread2.start();

		printMessage(null);
	    
	    while (thread1.isAlive() || thread2.isAlive()) {
	    	try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
	    printMessage(null);
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
	    public void run() {
	    	boolean locked = false;
	    	try {
	    		// Получение блокировки в течение TIME_WAIT
	    		locked = lock.tryLock(TIME_WAIT, TimeUnit.MILLISECONDS); 
	            if (locked) {
	            	resource = text;
	            	printMessage(null);
	            }
	            Thread.sleep(TIME_SLEEP);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        } finally{
	        	// Убираем блокировку
	        	String text = name + " : завершил работу";
	        	printMessage(text);
	            if (locked)
	            	lock.unlock();
	        }
	    }	
    }
	
	public static void main(String[] args) {
		new ReentrantLockExample();
	}
}
