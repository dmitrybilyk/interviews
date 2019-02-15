package com.learn.patterns.structural.decorator.trainings2;

/**
 * Created by dik81 on 12.02.19.
 */
public class IcecreamCreator implements CreatorInterface{
    @Override
    public void createSimpleIceCreame(){
        System.out.println("Creation of simple icecreame");
    }
}
