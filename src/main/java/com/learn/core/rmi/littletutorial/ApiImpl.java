package com.learn.core.rmi.littletutorial;

import java.rmi.*;
import java.rmi.server.*;

public class ApiImpl extends UnicastRemoteObject implements Api {
    private static final long serialVersionUID = 1L;
    private int counter = 0;

    public ApiImpl() throws RemoteException {
        super();
    }

    @Override
    public synchronized Data incrementCounter(Data value) throws RemoteException {
        counter += value.getValue();
        return new Data(counter);
    }
}