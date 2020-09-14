package com.learn.interview_questions.patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

// The class which keeps the list for history
public class CareTaker {
    private final List<Memento> mementoList = new ArrayList<>();
    public void push(Memento memento) {
        mementoList.add(memento);
    }

    public Memento pop() {
        int currentIndex = mementoList.size() - 1;
        Memento currentMemento = mementoList.get(currentIndex);
        mementoList.remove(currentMemento);
        return mementoList.get(mementoList.size() - 1);
    }
}
