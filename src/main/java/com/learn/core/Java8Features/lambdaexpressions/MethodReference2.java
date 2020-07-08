package com.learn.core.Java8Features.lambdaexpressions;

public class MethodReference2 {
    public static void ThreadStatus(){  
        System.out.println("Thread is running...");  
    }  
    public static void main(String[] args) {  
        Thread t2=new Thread(() -> ThreadStatus());
        t2.start();       
    }  
}  
