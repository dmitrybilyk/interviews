package com.learn.patterns.structural.decorator.trainings3;

/**
 * Created by dik81 on 16.02.19.
 */
public class FishSoupDecorator extends SoupBaseDecorator {
    public FishSoupDecorator(Soup soup) {
        super(soup);
    }

    @Override
    public void createSoup() {
        super.createSoup();
        System.out.println("fish");
    }
}
