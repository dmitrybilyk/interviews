package com.learn;

import org.apache.commons.lang.StringUtils;

/**
 * Created by dmitry on 10.02.18.
 */
public class Main {
    public static void main(String[] args) {
        String sourceText = "В одному казковому місті жили коротульки. " +
                "Коротульками їх називали тому, що вони були зовсім-зовсім" +
                "крихітні, кожен коротулька був на зріст як невеличкий огірок." +
                "В їхньому місті було дуже красиво. Навколо кожного будиночка росли квіти:" +
                "маргаритки, ромашки, кульбаби. Там навідь вулиці мали назви квіток:" +
                "вулиця дзвіночків, алея ромашок, бульвар волошок. А саме місто звалось" +
                "Квітковим Містом. Воно стояло на березі струмка. Цей струмок коротульки" +
                "називали огірковою річкою, тому що по берегах струмка росло багато огірків. Коротульки" +
                "робили з березової кори човники, перепливали річку й ходили в ліс по " +
                "ягоди, по гриби, по горіхи.";

        String alphabet = "AБВГДЕЄЖЗИІЇЙКЛМНОПРСТУФХЦЧШЩЬЮЯ";
//        String alphabetSmall = "aбвгдеєжзиіїйклмнопрстуфхцчшщьюя";

        for (char c : sourceText.toCharArray()) {
            System.out.println(c + " - " + StringUtils.countMatches(sourceText, String.valueOf(c)) +
                    StringUtils.countMatches(sourceText, String.valueOf(c).toLowerCase()));
        }
    }
}
