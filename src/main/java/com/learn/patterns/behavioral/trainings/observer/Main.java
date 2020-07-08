package com.learn.patterns.behavioral.trainings.observer;

/**
 * Created by dmitry on 23.01.17.
 */
public class Main {
  public static void main(String[] args) {
    News news = new News();
    Reader reader = new Reader(news);
    Reader reader2 = new Reader(news);
    news.setNews("Shakhtar champion");
  }
}
