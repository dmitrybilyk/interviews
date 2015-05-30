package com.learn.guava.predicates;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmitry on 05.01.15.
 */
public class ContainsIgnoreCaseObjects {
    public static void main(String[] args) {
        final Person searchedPerson = new Person("test33");
        List<Person> checkedList = new ArrayList<>();
        checkedList.add(new Person("Test"));
        checkedList.add(new Person("Test2"));
        checkedList.add(new Person("Test3"));

        Predicate ignoreCasePredicate = new Predicate() {

            @Override
            public boolean apply(Object input) {
                Person checkedPerson = (Person) input;
                return checkedPerson.getName().equalsIgnoreCase(searchedPerson.getName());
            }
        };
        String personName = (String) Iterables.find(checkedList, ignoreCasePredicate, "");
        System.out.println(personName != null);
    }
}
