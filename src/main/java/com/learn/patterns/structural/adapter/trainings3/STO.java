package com.learn.patterns.structural.adapter.trainings3;

/**
 * Created by dmitry on 29.01.19.
 */
public class STO {
    public void fixVehicleWithMotoFixersUsingAdapter(Vehicle vehicle) {
        System.out.println("Fixing - " + vehicle.getClass().getSimpleName());
        MotoFixer motoFixer = new MotoAdapter();
        Motobike motobike = new Motobike();
        motobike.setName(vehicle.getName());
        motoFixer.fixMoto(motobike);
    }
    public void fixMotobike(Motobike motobike) {
        System.out.println("Fixing - " + motobike.getClass().getSimpleName());
        MotoFixer motoFixer = new UsualMotoFixer();
        motoFixer.fixMoto(motobike);
    }
}
