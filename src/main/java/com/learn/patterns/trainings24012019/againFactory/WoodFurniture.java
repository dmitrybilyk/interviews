package com.learn.patterns.trainings24012019.againFactory;

/**
 * Created by dik81 on 25.01.19.
 */
public class WoodFurniture extends Furniture {
    public WoodFurniture(TYPE type, Aim aim) {
        super(type, aim);
    }
    @Override
    public void commonConstruct() {
        super.commonConstruct();
        System.out.println("specific work wood");
    }
}
