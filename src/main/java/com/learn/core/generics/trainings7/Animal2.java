package com.learn.core.generics.trainings7;

public class Animal2 implements Comparable<Animal2>{
        private String name;

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        @Override public int compareTo(Animal2 animal) {
                return name.compareTo(animal.getName());
        }
//        public int compareTo(@NotNull Object animal) {
//                return name.compareTo(((Animal)animal).getName());
//        }
}