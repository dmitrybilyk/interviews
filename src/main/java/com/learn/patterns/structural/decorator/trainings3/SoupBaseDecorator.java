package com.learn.patterns.structural.decorator.trainings3;

/**
 * Created by dik81 on 16.02.19.
 */
public class SoupBaseDecorator implements Soup {
    private Soup soup;

    public SoupBaseDecorator(Soup soup) {
        this.soup = soup;
    }

    @Override
    public void createSoup() {
        soup.createSoup();
    }
}
