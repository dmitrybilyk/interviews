package com.learn.patterns.behavioral.visitor.trainings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmitry on 24.03.17.
 */
public class Main {
  public static void main(String[] args) {
    List<MatchItemElement> visitors = new ArrayList<>();
    visitors.add(new FootballMatch());
    visitors.add(new HockeyMatch());
    for (MatchItemElement visitor : visitors) {
      visitor.accept(new MatchWatchCostVisitorImpl());
    }
  }
}
