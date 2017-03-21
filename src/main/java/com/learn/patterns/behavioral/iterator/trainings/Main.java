package com.learn.patterns.behavioral.iterator.trainings;

import java.util.Arrays;

/**
 * Created by dmitry on 21.03.17.
 */
public class Main {
  public static void main(String[] args) {
    BagCollection bagCollection = new BagCollectionImpl(Bag.BAG_TYPE.BIG_BAG, Arrays.asList(new Bag("bag1", Bag.BAG_TYPE.BIG_BAG),
            new Bag("bag2", Bag.BAG_TYPE.BIG_BAG), new Bag("bag3", Bag.BAG_TYPE.SMALL_BAG)));
    BagIterator iterator = bagCollection.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next().getName());
    }

  }
}
