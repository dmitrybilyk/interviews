package com.learn.patterns.trainings24012019.againFactory;

/**
 * Created by dik81 on 25.01.19.
 */
public class ForKitchenFurnitureFactory extends FurnitureFactory {
    public Furniture createFurniture(Furniture.TYPE type) {
        if (type == Furniture.TYPE.LUXURY) {
            return new LuxuryFurniture(Furniture.TYPE.LUXURY, Aim.FOR_KITCHEN);
        } else {
            return new WoodFurniture(Furniture.TYPE.WOOD, Aim.FOR_KITCHEN);
        }
    }
}
