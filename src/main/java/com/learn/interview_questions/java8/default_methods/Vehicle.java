package com.learn.interview_questions.java8.default_methods;

public interface Vehicle {
    
    String getBrand();
    
    String speedUp();
    
    String slowDown();
    
    default String turnAlarmOn() {
        return "Turning the vehicle alarm on.";
    }
    
    default String turnAlarmOff() {
        return "Turning the vehicle alarm off.";
    }
}