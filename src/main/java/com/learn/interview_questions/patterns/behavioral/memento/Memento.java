package com.learn.interview_questions.patterns.behavioral.memento;

// The class representing some state of the originator
public class Memento {
    public Memento(String content) {
        this.content = content;
    }

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
