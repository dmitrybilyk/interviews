package com.learn.patterns.structural.facade.trainings;

/**
 * Created by dmitry on 07.03.17.
 */
public class Main {
  public static void main(String[] args) {
    MovieShooterFacade facade = new MovieShooterFacade();
//    facade.totalShoot(null);
    facade.totalShoot(MovieShooterFacade.MovieType.COMEDY);
  }
}
