package com.learn.effectivejava.refactoring.refactoring_guru.razduvalschiki.bolshoy_class;

/**
 * Created by Dimon on 05.05.2016.
 */
public class izvlecheniye_interfeisa {
//    class TimeSheet {
//        // ...
//        public double charge(Employee employee, int days) {
//            double base = employee.getRate() * days;
//            if (employee.hasSpecialSkill()) {
//                return base * 1.05;
//            }
//            else {
//                return base;
//            }
//        }
//    }
//
//    class Employee {
//        // ...
//        public int getRate() {
//            // ...
//        }
//        public boolean hasSpecialSkill() {
//            // ...
//        }
//    }
//
//    TO
//
//    class TimeSheet {
//        // ...
//        public double charge(Billable employee, int days) {
//            double base = employee.getRate() * days;
//            if (employee.hasSpecialSkill()) {
//                return base * 1.05;
//            }
//            else {
//                return base;
//            }
//        }
//    }
//
//    interface Billable {
//        public int getRate();
//        public boolean hasSpecialSkill();
//    }
//
//    class Employee implements Billable {
//        // ...
//        @Override public int getRate() {
//            // ...
//        }
//        @Override public boolean hasSpecialSkill() {
//            // ...
//        }
//    }
}
