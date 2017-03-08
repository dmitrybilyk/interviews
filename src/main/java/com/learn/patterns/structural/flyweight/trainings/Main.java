package com.learn.patterns.structural.flyweight.trainings;

/**
 * Created by dmitry on 08.03.17.
 */
public class Main {
  public static void main(String[] args) {
    HumanFlyweightFactory humanFlyweightFactory = new HumanFlyweightFactory();
    Human human = humanFlyweightFactory.getHumanWithSomeRace("nigger");
    human.setName("some nigger 1");
    System.out.println(human);
    Human human2 = humanFlyweightFactory.getHumanWithSomeRace("nigger");
    human2.setName("some nigger 2");
    System.out.println(human2);
  }
}
