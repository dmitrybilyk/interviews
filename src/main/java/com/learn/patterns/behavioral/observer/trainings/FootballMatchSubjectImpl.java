package com.learn.patterns.behavioral.observer.trainings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmitry on 23.03.17.
 */
public class FootballMatchSubjectImpl implements MatchSubject {
  private List<MatchObserver> observerList = new ArrayList<>();

  private String info;

  public String getInfo() {
    return info;
  }

  @Override
  public void setInfo(String info) {
    this.info = info;
    notifyObservers();
  }

  @Override
  public void register(MatchObserver observer) {
    observerList.add(observer);
  }

  @Override
  public void unregister(MatchObserver observer) {
    observerList.remove(observer);
  }

  @Override
  public void notifyObservers() {
    for (MatchObserver matchObserver : observerList) {
      matchObserver.getUpdate(info);
    }
  }
}
