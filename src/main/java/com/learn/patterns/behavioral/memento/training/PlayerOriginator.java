package com.learn.patterns.behavioral.memento.training;

/**
 * Created by dmitry on 22.03.17.
 */
public class PlayerOriginator {
  private String name;
  private String biograthy;

  public Memento save() {
    return new Memento(name, biograthy);
  }

  public void updateToPreviousState(Object object) {
    Memento memento = (Memento)object;
    this.name = memento.getName();
    this.biograthy = memento.getBiograthy();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBiograthy() {
    return biograthy;
  }

  public void setBiograthy(String biograthy) {
    this.biograthy = biograthy;
  }

  private class Memento {
    private String name;
    private String biograthy;

    public Memento(String name, String biograthy) {
      this.name = name;
      this.biograthy = biograthy;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getBiograthy() {
      return biograthy;
    }

    public void setBiograthy(String biograthy) {
      this.biograthy = biograthy;
    }
  }
}
