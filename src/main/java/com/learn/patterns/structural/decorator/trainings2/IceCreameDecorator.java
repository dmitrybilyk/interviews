package com.learn.patterns.structural.decorator.trainings2;

/**
 * Created by dik81 on 12.02.19.
 */
public class IceCreameDecorator implements CreatorInterface{
    protected CreatorInterface creatorInterface;

    public IceCreameDecorator(CreatorInterface creatorInterface) {
        this.creatorInterface = creatorInterface;
    }

    @Override
    public void createSimpleIceCreame() {
        creatorInterface.createSimpleIceCreame();
    }
}
