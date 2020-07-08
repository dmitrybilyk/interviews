package com.learn.effectivejava.refactoring.refactoring_guru.zamusorivateli.dublirovaniye_coda;

/**
 * Created by Dimon on 13.05.2016.
 */
public class podyem_tela_konstructora {
//    class Employee {
//        // ...
//        protected String name;
//        protected String id;
//    }
//
//    class Manager extends Employee {
//        // ...
//        private int grade;
//        public Manager(String name, String id, int grade) {
//            this.name = name;
//            this.id = id;
//            this.grade = grade;
//        }
//    }
//
//    TO
//
//    class Employee {
//        // ...
//        protected String name;
//        protected String id;
//        protected Employee(String name, String id) {
//            this.name = name;
//            this.id = id;
//        }
//    }
//
//    class Manager extends Employee {
//        // ...
//        private int grade;
//        public Manager(String name, String id, int grade) {
//            super(name, id);
//            this.grade = grade;
//        }
//    }
}
