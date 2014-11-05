package com.learn.guava;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

/**
 * Created by dmitry on 8/28/14.
 */
public class FilterACollectionCustomPredicate {
    public static void main(String[] args) {
        List<Integer> numbers = Lists.newArrayList(1, 2, 3, 6, 10, 34, 57, 89);
        Predicate<Integer> acceptEven = new Predicate<Integer>() {
            @Override
            public boolean apply(Integer number) {
                return (number % 2) == 0;
            }
        };
        List<Integer> evenNumbers = Lists.newArrayList(Collections2.filter(numbers, acceptEven));
        Integer found = Collections.binarySearch(evenNumbers, 57);
        assertThat(found, lessThan(0));
    }
}

//todo
//http://www.baeldung.com/guava-functions-predicates
