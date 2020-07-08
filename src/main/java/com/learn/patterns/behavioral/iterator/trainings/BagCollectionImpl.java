package com.learn.patterns.behavioral.iterator.trainings;

import com.learn.patterns.behavioral.iterator.Channel;
import com.learn.patterns.behavioral.iterator.ChannelTypeEnum;
import org.hibernate.type.BagType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmitry on 21.03.17.
 */
public class BagCollectionImpl implements BagCollection {
  private Bag.BAG_TYPE type;
  private List<Bag> bagList = new ArrayList<>();

  public BagCollectionImpl(Bag.BAG_TYPE type, List<Bag> bagList) {
    this.type = type;
    this.bagList = bagList;
  }

  @Override
  public void addBag(Bag bag) {
    bagList.add(bag);
  }

  @Override
  public void removeBag(Bag bag) {
    bagList.remove(bag);
  }

  @Override
  public BagIterator iterator() {
    return new BagIteratorImpl() {
    };
  }

  public List<Bag> getBagList() {
    return bagList;
  }

  private class BagIteratorImpl implements BagIterator {
    int position = 0;
    @Override
    public Bag next() {
      Bag bag = bagList.get(position);
      position++;
      return bag;
    }

    @Override
    public boolean hasNext() {
      while (position < bagList.size()) {
        Bag c = bagList.get(position);
        if (c.getBagType().equals(type)) {
          return true;
        } else
          position++;
      }
      return false;
    }
  }
}
