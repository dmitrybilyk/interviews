package com.learn.patterns.structural.facade.trainings2;

/**
 * Created by dik81 on 26.02.19.
 */
public class FacadeDemo {
    public static void main(String[] args) {
        ShapesDrawFacade facade = new ShapesDrawFacade();
        facade.drawSquare();
        facade.drawRectangle();
    }
}
