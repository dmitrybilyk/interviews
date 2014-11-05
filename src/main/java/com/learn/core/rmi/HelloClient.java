package com.learn.core.rmi;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;

public class HelloClient
{
    public static void main(String arg[])
    {
        String message = "blank";

        // I download server's stubs ==> must set a SecurityManager
        System.setSecurityManager(new RMISecurityManager());

        try
        {
           Hello obj = (Hello) Naming.lookup( "//" +
                "127.0.0.1" +
                "/HelloServer");         //objectname in registry
           System.out.println(obj.sayHello());
        }
        catch (Exception e)
        {
           System.out.println("HelloClient exception: " + e.getMessage());
           e.printStackTrace();
        }
    }
} 