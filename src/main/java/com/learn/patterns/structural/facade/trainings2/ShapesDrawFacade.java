package com.learn.patterns.structural.facade.trainings2;

/**
 * Created by dik81 on 26.02.19.
 */
public class ShapesDrawFacade {
    private Shape rectangle;
    private Shape square;

    public ShapesDrawFacade() {
        rectangle = new Rectangle();
        square = new Square();
    }
    public void drawRectangle() {
        rectangle.draw();
    }
    public void drawSquare() {
        square.draw();
    }
}
