package com.learn.patterns.behavioral.observer.tutpoint;

public abstract class Observer {
   protected Subject subject;
   public abstract void update();
}