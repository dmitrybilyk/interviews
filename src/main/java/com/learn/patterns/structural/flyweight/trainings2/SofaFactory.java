package com.learn.patterns.structural.flyweight.trainings2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dik81 on 27.02.19.
 */
public class SofaFactory {
    private static Map<String, Sofa> sofaMap = new HashMap<>();
    public static Sofa getSofaByColor(String color) {
        Sofa sofa = sofaMap.get(color);
        if (sofa == null) {
            Sofa newSofa = new Sofa(color);
            sofaMap.put(color, newSofa);
            return newSofa;
        } else {
            return sofa;
        }
    }
}
