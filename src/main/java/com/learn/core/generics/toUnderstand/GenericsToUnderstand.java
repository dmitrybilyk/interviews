package com.learn.core.generics.toUnderstand;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public class GenericsToUnderstand {
    public static <K, V> boolean addToGroupMap(K key, V value, Map<K, Collection<V>> checkMap){

        assert checkMap!=null;
        boolean result = false;

        Collection<V> vList = checkMap.get(key);
        if (vList==null){
            checkMap.put(key, new ArrayList<V>(Collections.singleton(value)));
        }else {
            vList.add(value);
            result = true;
        }
        return result;
    }

    class A { }
    class B extends A { }
    class C extends B { }

    // Для демонстрации контейнера
    class S<V> {
        private V value;

        public V get() { return value; }
        public void set(V value) { this.value = value; }
    }
}
