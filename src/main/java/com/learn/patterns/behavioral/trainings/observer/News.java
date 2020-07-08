package com.learn.patterns.behavioral.trainings.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmitry on 23.01.17.
 */
public class News {
  private String news = "some article";
  private List<Reader> readers;

  public News() {
    readers = new ArrayList<>();
  }

  public String getNews() {
    return news;
  }

  public void register(Reader reader) {
    readers.add(reader);
  }

  public void setNews(String news) {
    this.news = news;
    for (Reader reader: readers) {
      reader.update();
    }
  }
}
