package com.learn.guava;

import com.google.common.base.Splitter;

/**
 * Created by dmitry on 8/28/14.
 */
public class StringSplittingQuizMain {
    public static void main(String[] args) {
        String s = " foo, ,bar, quux,";

        System.out.println(Splitter.on(',')
                .trimResults()
                .omitEmptyStrings()
                .split(s));
    }
}

// Also there is a StringJoiner, CharMatcher
