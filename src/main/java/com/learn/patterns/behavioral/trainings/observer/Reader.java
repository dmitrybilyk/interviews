package com.learn.patterns.behavioral.trainings.observer;

/**
 * Created by dmitry on 23.01.17.
 */
public class Reader {
  private News news;

  public Reader(News news) {
    this.news = news;
    news.register(this);
  }

  public void update() {
    System.out.println("Read some news - " + news.getNews());
  }
}
