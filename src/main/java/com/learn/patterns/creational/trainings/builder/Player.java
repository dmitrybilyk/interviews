package com.learn.patterns.creational.trainings.builder;

/**
 * Created by dmitry on 15.02.17.
 */
public class Player {
  private String name;
  private int age;

  public int getHundredMetersSpeed() {
    return hundredMetersSpeed;
  }

  public void setHundredMetersSpeed(int hundredMetersSpeed) {
    this.hundredMetersSpeed = hundredMetersSpeed;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getTenMilesSpeed() {
    return tenMilesSpeed;
  }

  public void setTenMilesSpeed(int tenMilesSpeed) {
    this.tenMilesSpeed = tenMilesSpeed;
  }

  public boolean isGoalKeeper() {
    return isGoalKeeper;
  }

  public void setIsGoalKeeper(boolean isGoalKeeper) {
    this.isGoalKeeper = isGoalKeeper;
  }

  private int hundredMetersSpeed;
  private int tenMilesSpeed;
  private boolean isGoalKeeper;

  public Player(PlayerBuilder playerBuilder) {
   this.name = playerBuilder.getName();
    this.age = playerBuilder.getAge();
    this.hundredMetersSpeed = playerBuilder.getHundredMetersSpeed();
    this.tenMilesSpeed = playerBuilder.getTenMilesSpeed();
    this.isGoalKeeper = playerBuilder.getIsGoalKeeper();
  }

  public static class PlayerBuilder {
    private String name;
    private int age;
    private int hundredMetersSpeed;
    private int tenMilesSpeed;
    private boolean isGoalKeeper;

    public PlayerBuilder(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public PlayerBuilder hundredMetersSpeed(int hundredMetersSpeed) {
      this.hundredMetersSpeed = hundredMetersSpeed;
      return this;
    }

    public PlayerBuilder tenMilesSpeed(int tenMilesSpeed) {
      this.tenMilesSpeed = tenMilesSpeed;
      return this;
    }

    public PlayerBuilder isGoalkeeper(boolean isGoalKeeper) {
      this.isGoalKeeper = isGoalKeeper;
      return this;
    }

    public Player build() {
      return new Player(this);
    }

    public String getName() {
      return name;
    }

    public int getAge() {
      return age;
    }

    public int getHundredMetersSpeed() {
      return hundredMetersSpeed;
    }

    public int getTenMilesSpeed() {
      return tenMilesSpeed;
    }

    public boolean getIsGoalKeeper() {
      return isGoalKeeper;
    }
  }

  @Override
  public String toString() {
    return name + " " + isGoalKeeper + " " + hundredMetersSpeed + "  " + tenMilesSpeed;
  }
}
