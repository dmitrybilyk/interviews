package com.learn.core.collections.Map;

import com.google.common.collect.ComparisonChain;

import java.util.*;

/**
 * Created by dik81 on 04.01.19.
 */
public class Main {
    public static void main(String[] args) {
        Map<ObjectKey, ObjectValue> map = new TreeMap<>(new Comparator<ObjectKey>() {
            @Override
            public int compare(ObjectKey o1, ObjectKey o2) {
                return 0;
            }
        });
        ObjectKey objectKey = new ObjectKey("Dima", "Bilyk", 38);
        ObjectKey objectKey1 = new ObjectKey("Dima", "Bilyk", 38);
        ObjectValue objectValue = new ObjectValue("Some value");
        ObjectValue objectValue2 = new ObjectValue("Some value2");
        ObjectKey objectKey2 = new ObjectKey("Dima", "Bilyk", 31);
        map.put(objectKey, objectValue);
        map.put(objectKey1, objectValue);
        map.put(objectKey2, objectValue2);


        for (ObjectValue key : map.values()) {
            System.out.println(key.getSomeValue());
        }
    }
}
