package com.learn.effectivejava.refactoring.refactoring_guru.narushitely_oo_dezaina.otkas_ot_nasledstva;

/**
 * Created by Dimon on 10.05.2016.
 */
public class zamena_nasledovaniya_delegirovaniem {
//    class Engine {
//        //…
//        private double fuel;
//        private double CV;
//
//        public double getFuel() {
//            return fuel;
//        }
//        public void setFuel(double fuel) {
//            this.fuel = fuel;
//        }
//        public double getCV() {
//            return CV;
//        }
//        public void setCV(double cv) {
//            this.CV = cv;
//        }
//    }
//
//    class Car extends Engine {
//        // ...
//        private String brand;
//        private String model;
//
//        public String getName() {
//            return brand + " " + model + " (" + getCV() + "CV)";
//        }
//        public String getModel() {
//            return model;
//        }
//        public void setModel(String model) {
//            this.model = model;
//        }
//        public String getBrand() {
//            return brand;
//        }
//        public void setBrand(String brand) {
//            this.brand = brand;
//        }
//    }
//
//    TO
//
//    class Engine {
//        //…
//        private double fuel;
//        private double CV;
//
//        public double getFuel() {
//            return fuel;
//        }
//        public void setFuel(double fuel) {
//            this.fuel = fuel;
//        }
//        public double getCV() {
//            return CV;
//        }
//        public void setCV(double cv) {
//            this.CV = cv;
//        }
//    }
//
//    class Car {
//        // ...
//        private String brand;
//        private String model;
//        protected Engine engine;
//
//        public Car() {
//            this.engine = new Engine();
//        }
//        public String getName() {
//            return brand + " " + model + " (" + engine.getCV() + "CV)";
//        }
//        public String getModel() {
//            return model;
//        }
//        public void setModel(String model) {
//            this.model = model;
//        }
//        public String getBrand() {
//            return brand;
//        }
//        public void setBrand(String brand) {
//            this.brand = brand;
//        }
//    }
}
