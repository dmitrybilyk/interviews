package com.learn.patterns.structural.bridge.trainings;

/**
 * Created by dmitry on 06.03.17.
 */
public class Main {
    public static void main(String[] args) {
        Human man = new Man(new FootballTrainer());
        man.train();
        Wooman wooman = new Wooman(new HockeyTrainer());
        wooman.train();
        Pet dog = new Dog(new FootballTrainer());
        dog.train();
        Pet cat = new Cat(new HockeyTrainer());
        cat.train();
    }
}
