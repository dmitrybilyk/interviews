package com.learn.patterns.structural.decorator.trainings3;

/**
 * Created by dik81 on 16.02.19.
 */
public class MeatSoupDecorator extends SoupBaseDecorator {
    public MeatSoupDecorator(Soup soup) {
        super(soup);
    }

    @Override
    public void createSoup() {
        super.createSoup();
        System.out.println("meat");
    }
}
