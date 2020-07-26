package com.learn.interview_questions.patterns.structural.bridge.sofaimpl;

import com.learn.interview_questions.patterns.structural.bridge.Color;
import com.learn.interview_questions.patterns.structural.bridge.Size;
import com.learn.interview_questions.patterns.structural.bridge.Sofa;

public class ItalianSofa extends Sofa {
    public ItalianSofa(Color color, Size size) {
        super(color, size);
    }

    @Override
    protected void applyColor() {
        System.out.print("This is a " + getClass().getSimpleName() + " and it's color is ... ");
        color.applyColor();
    }

    @Override
    protected void applySize() {
        System.out.print("This is a " + getClass().getSimpleName() + " and it's size is ... ");
        size.applySize();
    }
}
