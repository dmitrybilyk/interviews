package com.learn.core.generics.genericslearn.service;

import com.learn.core.generics.genericslearn.model.Human;

/**
 * Created by dik81 on 10/22/14.
 */
public class Performance<T, E> {

  public T getPerformer(T t){
    return addBBBToName(t);
  }

  private T addBBBToName(T t){
    Human human = (Human) t;
    human.setName(human.getName() + "BBB");
    return (T) human;
  }

}
