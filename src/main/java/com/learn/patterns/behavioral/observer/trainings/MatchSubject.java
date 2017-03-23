package com.learn.patterns.behavioral.observer.trainings;

/**
 * Created by dmitry on 23.03.17.
 */
public interface MatchSubject {
  void setInfo(String info);

  void register(MatchObserver observer);
  void unregister(MatchObserver observer);
  void notifyObservers();
}
