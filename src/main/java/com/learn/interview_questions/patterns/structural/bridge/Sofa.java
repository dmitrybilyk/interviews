package com.learn.interview_questions.patterns.structural.bridge;

public abstract class Sofa {
    protected Color color;
    protected Size size;

    public Sofa(Color color, Size size) {
        this.color = color;
        this.size = size;
    }

    protected abstract void applyColor();
    protected abstract void applySize();
}
