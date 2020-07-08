package com.learn.patterns.behavioral.trainings.state;

/**
 * Created by dmitry on 16.01.17.
 */
public class PhysicalActivityContext implements ActivityContext {
  ActivityContext context;

  public void setContext(ActivityContext context) {
    this.context = context;
  }

  @Override
  public void doAction() {
    context.doAction();
  }
}
