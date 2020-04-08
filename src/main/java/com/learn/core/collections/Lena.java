package com.learn.core.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by dmitry on 17.08.17.
 */
public class Lena {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Dima"));
        list.add(new Person("Dima2"));
        for (Person person : list) {
            System.out.println(person.getName());
        }
        System.out.println(list.size());
        System.out.println(list.get(1).getName());

        Set<Person> personSet = new HashSet<>();
        personSet.add(new Person("setPerson1"));
        personSet.add(new Person("setPerson2"));
        for (Person person : personSet) {
            System.out.println(person.getName());
        }
        System.out.println(list.size());
    }
}
