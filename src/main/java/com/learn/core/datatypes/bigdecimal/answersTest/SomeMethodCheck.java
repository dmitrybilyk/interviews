package com.learn.core.datatypes.bigdecimal.answersTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmitry on 03.02.15.
 */
public class SomeMethodCheck {
    public static void main(String[] args) {
        System.out.println(getBestAttainablePointsScore());

    }


    public static BigDecimal getBestAttainablePointsScore() {
        List<AnswerBO> answerBOList = fillTheList();
        BigDecimal answerMax = BigDecimal.ZERO;
        for (AnswerBO answerBO : answerBOList) {
            BigDecimal answerValue = answerBO.getAnswerValue();
            if (answerValue != null && answerMax.compareTo(answerValue) < 0) {
                answerMax = answerValue;
            }
        }
        return answerMax;
    }

    private static List<AnswerBO> fillTheList() {
        List<AnswerBO> answerBOList = new ArrayList<>();
        AnswerBO answerBO = new AnswerBO();
        answerBO.setAnswerValue(new BigDecimal("30"));
        answerBOList.add(answerBO);
        AnswerBO answerBOWithNull = new AnswerBO();
        answerBOList.add(answerBOWithNull);
        AnswerBO answerBOWithNegative = new AnswerBO();
        answerBOWithNegative.setAnswerValue(new BigDecimal("-30"));
        answerBOList.add(answerBOWithNegative);
        AnswerBO answerBOWithMax = new AnswerBO();
        answerBOWithMax.setAnswerValue(new BigDecimal("40"));
        answerBOList.add(answerBOWithMax);
        AnswerBO answerBO4 = new AnswerBO();
        answerBO4.setAnswerValue(new BigDecimal("30"));
        answerBOList.add(answerBO4);
        return answerBOList;
    }

}

