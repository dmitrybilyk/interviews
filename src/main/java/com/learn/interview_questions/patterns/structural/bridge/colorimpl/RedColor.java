package com.learn.interview_questions.patterns.structural.bridge.colorimpl;

import com.learn.interview_questions.patterns.structural.bridge.Color;

public class RedColor implements Color {

    public void applyColor(){
        System.out.println("red.");
    }
}