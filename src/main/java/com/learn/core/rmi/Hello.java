package com.learn.core.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote
		{
			String sayHello() throws RemoteException;
		}