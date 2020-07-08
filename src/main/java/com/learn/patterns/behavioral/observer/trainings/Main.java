package com.learn.patterns.behavioral.observer.trainings;

/**
 * Created by dmitry on 23.03.17.
 */
public class Main {
  public static void main(String[] args) {
    MatchSubject subject = new FootballMatchSubjectImpl();
    MatchObserver observer1 = new TVMatchObserver("Dima");
    MatchObserver observer2 = new TVMatchObserver("Ruslan");
    subject.register(observer1);
    subject.register(observer2);
    subject.setInfo("some info");
    subject.unregister(observer1);
    subject.setInfo("some new info");
  }
}
