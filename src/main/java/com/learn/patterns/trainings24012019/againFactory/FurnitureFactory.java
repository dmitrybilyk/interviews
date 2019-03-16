package com.learn.patterns.trainings24012019.againFactory;

/**
 * Created by dik81 on 25.01.19.
 */
public class FurnitureFactory {
    public Furniture createFurniture(Furniture.TYPE type) {
        Furniture furniture = null;
        if (type == Furniture.TYPE.LUXURY) {
            furniture = new LuxuryFurniture(type, Aim.FOR_KITCHEN);
        } else {
            furniture = new WoodFurniture(type, Aim.FOR_KITCHEN);
        }
        furniture.commonConstruct();
        return furniture;
    }
}
