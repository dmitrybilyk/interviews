package com.learn.core.collections.Map.LinkedHashMap;

import java.util.*;
 
public class BasicLinkedHashMap
{
    public static void main(String a[])
    {
        LinkedHashMap<String, String> lhm =
                new LinkedHashMap<String, String>(100, 0.75f, false);
        lhm.put("one", "practice.geeksforgeeks.org");
        lhm.put("two", "code.geeksforgeeks.org");
        lhm.put("four", "quiz.geeksforgeeks.org");

        for (String key : lhm.keySet()) {
            System.out.println(key);
        }

        lhm.get("two");

        for (String key : lhm.keySet()) {
            System.out.println(key);
        }
    }
}