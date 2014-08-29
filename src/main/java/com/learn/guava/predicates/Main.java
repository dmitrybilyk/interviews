package com.learn.guava.predicates;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmitry on 8/29/14.
 */
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("person1");
        person1.setAge(44);

        Person person2 = new Person();
        person2.setName("person2");
        person2.setAge(34);

        Person person3 = new Person();
        person3.setName("person3");
        person3.setAge(24);

        List<Person> persons = new ArrayList<Person>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        Predicate<Person> oldPersonPredicate = new Predicate<Person>() {
            @Override
            public boolean apply(Person input) {
                return input.getAge() > 30;
            }
        };

        Iterable<Person> oldPersons = Iterables.filter(persons, oldPersonPredicate);

        for (Person oldPerson : oldPersons) {
            System.out.println(oldPerson);
        }



        Function<Person, Person> toAdd10YearsFunction = new Function<Person, Person>(){
            @Override
            public Person apply(Person input) {
                input.setAge(input.getAge() + 10);
                return input;
            }
        };

        Iterable<Person> moreOldPersons = Iterables.transform(persons, toAdd10YearsFunction);

        for (Person oldPerson : moreOldPersons) {
            System.out.println(oldPerson);
        }



    }
}
