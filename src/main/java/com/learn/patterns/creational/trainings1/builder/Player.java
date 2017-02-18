package com.learn.patterns.creational.trainings1.builder;

/**
 * Created by dmitry on 18.02.17.
 */
public class Player {
  private String name;
  private int age;
  private String skill;
  private int weight;

  public Player(PlayeBuilder playeBuilder) {
    this.name = playeBuilder.getName();
    this.age = playeBuilder.getAge();
    this.skill = playeBuilder.getSkill();
    this.weight = playeBuilder.weight;
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

  public String getSkill() {
    return skill;
  }

  public void setSkill(String skill) {
    this.skill = skill;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }


public static class PlayeBuilder {
  private String name;
  private int age;
  private String skill;
  private int weight;

  public PlayeBuilder(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public PlayeBuilder skill(String skill) {
    this.skill = skill;
    return this;
  }

  public PlayeBuilder weight(int weight) {
    this.weight = weight;
    return this;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getSkill() {
    return skill;
  }

  public int getWeight() {
    return weight;
  }

  public Player build() {
    return new Player(this);
  }
}

  @Override
  public String toString() {
    return name + " " + age + " " + skill + " " + weight;
  }
}
