package com.learn.core.collections;

import java.util.HashSet;
import java.util.Set;

public class Compare2Sets {
    static class Student{
        private String name;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Student student = (Student) o;

            return name.equals(student.name);
        }

        @Override
        public int hashCode() {
            return name.hashCode();
        }

        public Student(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Set<Student> set1 = new HashSet<>();
        Student dima = new Student("Dima");
        Student lena = new Student("Dima");
        Student mircha = new Student("Mircha");
        Student nikita = new Student("Nikita");
        set1.add(dima);
        set1.add(nikita);

        Set<Student> set2 = new HashSet<>();
        set2.add(nikita);
        set2.add(dima);

        System.out.println(set1.equals(set2));
    }
}
