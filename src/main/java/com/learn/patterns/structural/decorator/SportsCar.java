package com.learn.patterns.structural.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: dmitriy.bilyk
 * Date: 12.11.13
 * Time: 21:38
 * To change this template use File | Settings | File Templates.
 */
public class SportsCar extends CarDecorator {

    public SportsCar(Car c) {
        super(c);
    }

    @Override
    public void assemble(){
        car.assemble();
        System.out.print(" Adding features of Sports Car.");
    }
}