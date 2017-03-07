package com.learn.patterns.structural.facade.trainings;

/**
 * Created by dmitry on 07.03.17.
 */
public class HorrorMovieShooter extends CommonShooter{
  @Override
  public void shoot() {
    super.shoot();
    System.out.println("horror is shooting");
  }
}
