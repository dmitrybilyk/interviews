package com.learn.patterns.behavioral.iterator.trainings;

/**
 * Created by dmitry on 21.03.17.
 */
public interface BagCollection {
  void addBag(Bag bag);
  void removeBag(Bag bag);
  BagIterator iterator();
}
