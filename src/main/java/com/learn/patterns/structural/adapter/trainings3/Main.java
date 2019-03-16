package com.learn.patterns.structural.adapter.trainings3;

/**
 * Created by dmitry on 29.01.19.
 */
public class Main {
    public static void main(String[] args) {
        STO sto = new STO();
        sto.fixVehicleWithMotoFixersUsingAdapter(new Vehicle());
    }
}
