package com.learn.guava;

import com.google.common.base.Optional;

/**
 * Created by dmitry on 8/28/14.
 */
public class OptionalsMain {
    public static void main(String[] args) {
        Optional<Integer> possible = Optional.of(5);
        System.out.println(possible.isPresent()); // returns true
        System.out.println(possible.get()); // returns 5
    }
}
