package com.learn.interview_questions.patterns.structural.bridge.sofaimpl;

import com.learn.interview_questions.patterns.structural.bridge.Color;
import com.learn.interview_questions.patterns.structural.bridge.Size;
import com.learn.interview_questions.patterns.structural.bridge.Sofa;

public class UkrainianSofa extends Sofa {
    public UkrainianSofa(Color color, Size size) {
        super(color, size);
    }

    @Override
    protected void applyColor() {
        System.out.print("This is a " + getClass().getSimpleName() + " and it's color is ... ");
        color.applyColor();
    }


    @Override
    public String toString() {
        return "The big sofa with a color of " + color;
    }

    @Override
    protected void applySize() {
        System.out.print("This is a " + getClass().getSimpleName() + " and it's size is ... ");
        size.applySize();
    }

}
