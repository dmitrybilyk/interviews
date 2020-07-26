package com.learn.interview_questions.patterns.structural.bridge.shapeimpl;

import com.learn.interview_questions.patterns.structural.bridge.Color;
import com.learn.interview_questions.patterns.structural.bridge.Shape;

public class Pentagon extends Shape {

    public Pentagon(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Pentagon filled with color ");
        color.applyColor();
    }

}
