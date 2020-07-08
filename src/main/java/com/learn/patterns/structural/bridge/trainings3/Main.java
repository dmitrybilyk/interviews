package com.learn.patterns.structural.bridge.trainings3;

/**
 * Created by dik81 on 07.02.19.
 */
public class Main {
    public static void main(String[] args) {
        Furniture sofa = new Sofa(new LuxuryType());
        sofa.applyType();
        sofa = new Chair(new UsualType());
        sofa.applyType();
    }
}
