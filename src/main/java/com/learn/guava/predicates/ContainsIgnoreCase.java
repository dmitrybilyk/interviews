package com.learn.guava.predicates;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by dmitry on 05.01.15.
 */
public class ContainsIgnoreCase {
    public static void main(String[] args) {
        final String value = "test";
        List<String> checkedList = new ArrayList<>();
        checkedList.add("Test");
        checkedList.add("Test2");
        checkedList.add("Test3");

        Predicate ignoreCasePredicate = new Predicate() {

            @Override
            public boolean apply(Object input) {
                String checkedValue = (String) input;
//                return checkedValue.equalsIgnoreCase(value);
                return checkedValue.equals(value);
            }
        };
        String iterator = (String) Iterables.find(checkedList, ignoreCasePredicate, "");
        System.out.println(iterator);
    }
}
