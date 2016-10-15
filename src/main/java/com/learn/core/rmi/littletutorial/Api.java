package com.learn.core.rmi.littletutorial;

import java.rmi.*;

public interface Api extends Remote {
    public Data incrementCounter(Data value) throws RemoteException;
}