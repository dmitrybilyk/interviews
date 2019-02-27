package com.learn.patterns.structural.flyweight.trainings2;

/**
 * Created by dik81 on 27.02.19.
 */
public class Main {
    public static void main(String[] args) {
        Sofa sofa = SofaFactory.getSofaByColor("red");
        sofa.setSize(5);
        Sofa sofa1 = SofaFactory.getSofaByColor("red");
        String s = "dfd";
    }
}
