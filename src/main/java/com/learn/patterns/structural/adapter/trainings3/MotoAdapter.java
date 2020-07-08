package com.learn.patterns.structural.adapter.trainings3;

/**
 * Created by dmitry on 29.01.19.
 */
public class MotoAdapter implements MotoFixer {

    @Override
    public void fixMoto(Motobike motobike) {
        System.out.println("fixing - " + motobike.getName());
    }
}
