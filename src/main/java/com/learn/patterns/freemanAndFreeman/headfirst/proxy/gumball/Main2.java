package com.learn.patterns.freemanAndFreeman.headfirst.proxy.gumball;

import java.rmi.*;
 
public class Main2
{
 
	public static void main(String[] args) {
		String[] location = {"rmi://santafe.mightygumball.com/gumballmachine",
		                     "rmi://boulder.mightygumball.com/gumballmachine",
		                     "rmi://seattle.mightygumball.com/gumballmachine"}; 
		
		if (args.length >= 0)
        {
            location = new String[1];
            location[0] = "rmi://" + "santafe.mightygumball.com" + "/gumballmachine";
        }
		
		GumballMonitor[] monitor = new GumballMonitor[location.length];
		
		
		
		for (int i=0;i < location.length; i++) {
			try {
           		GumballMachineRemote machine = 
						(GumballMachineRemote) Naming.lookup(location[i]);
           		monitor[i] = new GumballMonitor(machine);
				System.out.println(monitor[i]);
        	} catch (Exception e) {
            	e.printStackTrace();
        	}
		}
 
		for(int i=0; i < monitor.length; i++) {
			monitor[i].report();
		}
	}
}
