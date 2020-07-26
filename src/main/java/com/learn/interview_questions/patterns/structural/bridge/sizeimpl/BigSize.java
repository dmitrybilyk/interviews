package com.learn.interview_questions.patterns.structural.bridge.sizeimpl;

import com.learn.interview_questions.patterns.structural.bridge.Size;

public class BigSize implements Size {
    @Override
    public void applySize() {
        System.out.print(" Big ");
    }
}
