package com.learn.patterns.trainings24012019.againFactory;

/**
 * Created by dik81 on 25.01.19.
 */
public class Main {
    public static void main(String[] args) {
        Aim aim = Aim.FOR_HALL;
        FurnitureFactory furnitureFactory = new ForHallFurnitureFactory();
        Furniture furniture = furnitureFactory.createFurniture(Furniture.TYPE.LUXURY);
        System.out.println(furniture);
    }
}
