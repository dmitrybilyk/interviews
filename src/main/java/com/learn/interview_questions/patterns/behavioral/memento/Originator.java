package com.learn.interview_questions.patterns.behavioral.memento;

//The class object of which we want to have in a history
public class Originator {
    private CareTaker careTaker;
    private String content;

    public Originator(CareTaker careTaker) {
        this.careTaker = careTaker;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        careTaker.push(new Memento(content));
    }

    public void undo() {
        this.content = careTaker.pop().getContent();
    }
}
