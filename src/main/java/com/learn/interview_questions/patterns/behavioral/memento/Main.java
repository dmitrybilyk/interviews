package com.learn.interview_questions.patterns.behavioral.memento;

public class Main {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator(careTaker);
        originator.setContent("Dima");
        originator.setContent("Ruslan");
        originator.setContent("Oksana");
        originator.setContent("Vova");
        originator.setContent("Nina");
        originator.setContent("Lena");
        System.out.println(originator.getContent());
        originator.undo();
        originator.undo();
        originator.undo();
        System.out.println(originator.getContent());
    }
}
