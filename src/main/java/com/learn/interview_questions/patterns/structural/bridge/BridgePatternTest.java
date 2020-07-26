package com.learn.interview_questions.patterns.structural.bridge;

import com.learn.interview_questions.patterns.structural.bridge.colorimpl.GreenColor;
import com.learn.interview_questions.patterns.structural.bridge.colorimpl.RedColor;
import com.learn.interview_questions.patterns.structural.bridge.shapeimpl.Pentagon;
import com.learn.interview_questions.patterns.structural.bridge.shapeimpl.Triangle;
import com.learn.interview_questions.patterns.structural.bridge.sizeimpl.SmallSize;
import com.learn.interview_questions.patterns.structural.bridge.sofaimpl.UkrainianSofa;

public class BridgePatternTest {

//    Decouple an abstraction from its implementation so that the two can vary independently
//    The implementation of bridge design pattern follows the notion to prefer Composition over inheritance.
    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColor());
        tri.nonAbstractApplyColor();

        Shape pent = new Pentagon(new GreenColor());
        pent.nonAbstractApplyColor();

        Sofa ukrainianSofaSofa = new UkrainianSofa(new RedColor(), new SmallSize());
        ukrainianSofaSofa.applyColor();
        ukrainianSofaSofa.applySize();
//        System.out.println(bigSofa);
    }

}