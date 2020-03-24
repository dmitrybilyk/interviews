package com.learn.core.Java8Features.lambdaexpressions.trainings2;

import com.learn.core.Java8Features.lambdaexpressions.trainings2.newpack.Good;

class Car {
    private String number;
    private int year;
 
    public Car(String number, int year) {
        this.number = number;
        this.year = year;
        Good good = new Good();
    }
 
    public String getNumber() {
        return number;
    }
 
    public int getYear() {
        return year;
    }
}