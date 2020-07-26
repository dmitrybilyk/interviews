package com.learn.interview_questions.patterns.structural.bridge;

public abstract class Shape {
    //Composition - implementor
    protected Color color;

    //constructor with implementor as input argument
    public Shape(Color c){
        this.color=c;
    }

    abstract public void applyColor();

    public void nonAbstractApplyColor() {
        System.out.print(getClass().getSimpleName() + " filled with color ");
        color.applyColor();
    }
}