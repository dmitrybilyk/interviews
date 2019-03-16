package com.learn.patterns.structural.decorator.trainings2;

/**
 * Created by dik81 on 12.02.19.
 */
public class IceCreameChocolateDecorator extends IceCreameDecorator {
    public IceCreameChocolateDecorator(CreatorInterface icecreamCreator) {
        super(icecreamCreator);
    }

    @Override
    public void createSimpleIceCreame() {
        super.createSimpleIceCreame();
        System.out.println("Adding the chocolate");
    }
}
