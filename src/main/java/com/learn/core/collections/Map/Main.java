package com.learn.core.collections.Map;

import com.google.common.collect.ComparisonChain;

import java.util.*;

/**
 * Created by dik81 on 04.01.19.
 */
public class Main {
    public static void main(String[] args) {
        Map<ObjectKey, ObjectValue> map = new TreeMap<>((o1, o2) -> 0);
        ObjectKey objectKey = new ObjectKey("Dima", "Bilyk", 38);
        ObjectKey objectKey1 = new ObjectKey("Grut", "ASWE", 22);
        ObjectValue objectValue = new ObjectValue("Some value");
        ObjectValue objectValue2 = new ObjectValue("Some value2");
        ObjectValue objectValue3 = new ObjectValue("Lena value");
        ObjectKey objectKey2 = new ObjectKey("Qdad", "LKKJ", 31);
        ObjectKey objectKey3 = new ObjectKey("Lena", "Bilyk", 33);
        map.put(objectKey, objectValue);
        map.put(objectKey1, objectValue);
        map.put(objectKey2, objectValue2);
        map.put(objectKey3, objectValue3);


        for (ObjectValue v : map.values()) {
            System.out.println(v.getSomeValue());
        }
        //todo
        //Print TreeMap
        //for (Map.Entry<ObjectKey, ObjectValue> entry : map.entrySet()) {
          //  System.out.println("Key: " + entry.getKey() + ". Value: " + entry.getValue());
        //}
        System.out.println(map);

    }
}
