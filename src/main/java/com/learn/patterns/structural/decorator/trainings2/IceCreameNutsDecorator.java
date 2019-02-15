package com.learn.patterns.structural.decorator.trainings2;

/**
 * Created by dik81 on 12.02.19.
 */
public class IceCreameNutsDecorator extends IceCreameDecorator {
    public IceCreameNutsDecorator(CreatorInterface creatorInterface) {
        super(creatorInterface);
    }

    @Override
    public void createSimpleIceCreame() {
        super.createSimpleIceCreame();
        System.out.println("Adding nuts");
    }
}
