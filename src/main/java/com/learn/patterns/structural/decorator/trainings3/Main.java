package com.learn.patterns.structural.decorator.trainings3;

/**
 * Created by dik81 on 16.02.19.
 */
public class Main {
    public static void main(String[] args) {
        Soup soup = new MeatSoupDecorator(new FishSoupDecorator(new BasicSoup()));
        soup.createSoup();
    }
}
