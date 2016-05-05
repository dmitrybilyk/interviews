package com.learn.effectivejava.refactoring.refactoring_guru.razduvalschiki.oderzimost_elementarnimi_tipami;

/**
 * Created by Dimon on 05.05.2016.
 */
public class zamena_kodirovaniya_tipa_classom {
//    class Person {
//        public static final int O = 0;
//        public static final int A = 1;
//        public static final int B = 2;
//        public static final int AB = 3;
//
//        private int bloodGroup;
//
//        public Person(int code) {
//            bloodGroup = code;
//        }
//        public void setBloodGroup(int code) {
//            bloodGroup = code;
//        }
//        public int getBloodGroup() {
//            return bloodGroup;
//        }
//    }
//
//    // Somewhere in client code.
//    Person parent = new Person(Person.O);
//    if (parent.getBloodGroup() == Person.AB) {
//        // ...
//    }
//    child.setBloodGroup(parent.getBloodGroup());
//
//    TO
//
//    class Person {
//        private BloodGroup bloodGroup;
//
//        public Person(BloodGroup bloodGroup) {
//            bloodGroup = bloodGroup;
//        }
//        public void setBloodGroup(BloodGroup bloodGroup) {
//            bloodGroup = bloodGroup;
//        }
//        public BloodGroup getBloodGroup() {
//            return bloodGroup;
//        }
//    }
//
//    class BloodGroup {
//        private final int code;
//
//        private BloodGroup(int code) {
//            this.code = code;
//        }
//        public int getCode() {
//            return this.code;
//        }
//
//        public static BloodGroup O() {
//            return new BloodGroup(0);
//        }
//        public static BloodGroup A() {
//            return new BloodGroup(1);
//        }
//        public static BloodGroup B() {
//            return new BloodGroup(2);
//        }
//        public static BloodGroup AB() {
//            return new BloodGroup(3);
//        }
//    }
//
//    // Somewhere in client code.
//    Person parent = new Person(BloodGroup.O());
//    if (parent.getBloodGroup() == BloodGroup.AB()) {
//        // ...
//    }
//    child.setBloodGroup(parent.getBloodGroup());
}
