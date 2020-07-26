package com.learn.interview_questions.patterns.structural.bridge.shapeimpl;

import com.learn.interview_questions.patterns.structural.bridge.Color;
import com.learn.interview_questions.patterns.structural.bridge.Shape;

public class Triangle extends Shape {

    public Triangle(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Triangle filled with color ");
        color.applyColor();
    }

}
