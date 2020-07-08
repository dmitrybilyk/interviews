package com.learn.patterns.structural.decorator.trainings2;

/**
 * Created by dik81 on 12.02.19.
 */
public class IceCreameCoconateDecorator extends IceCreameDecorator {
    public IceCreameCoconateDecorator(CreatorInterface creatorInterface) {
        super(creatorInterface);
    }

    @Override
    public void createSimpleIceCreame() {
        super.createSimpleIceCreame();
        System.out.println("Adding the coconate");
    }
}
