package com.learn.patterns.structural.facade.trainings;

/**
 * Created by dmitry on 07.03.17.
 */
public class MovieShooterFacade {
  enum MovieType {
    HORROR, COMEDY
  }

  public void totalShoot(MovieType type) {
    CommonShooter shooter = null;
    if (type == null) {
      System.out.println("null");
      return;
    }
    switch (type) {
      case HORROR:
        shooter = new HorrorMovieShooter();
        break;
      case COMEDY:
        shooter = new ComedyMovieShooter();
        break;
        default:
          System.out.println("null");
    }
    shooter.shoot();
  }
}
