package com.learn.patterns.structural.decorator.trainings2;

/**
 * Created by dik81 on 12.02.19.
 */
public class Main {
    public static void main(String[] args) {
        CreatorInterface iceCreamCreator = new IceCreameChocolateDecorator(new IceCreameChocolateDecorator(new IcecreamCreator()));
        iceCreamCreator.createSimpleIceCreame();
    }
}
