package com.learn.interview_questions.exceptions;

public class SomeClient {
    public static void main(String[] args) {
        SomeUsefulContext someUsefulContext = new SomeUsefulContext();
        try {
            someUsefulContext.someAction(0);
        } catch (MyCustomException e) {
            e.printStackTrace();
        }
    }
}
