package com.learn.core.generics.trainings7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class  ListMapSumCalculator<T extends List<Map<String, Shape>>> {

        public Integer calculateAndPrint(T t) {
                int sum = 0;
                for (Map<String, Shape> stringShapeMap : t) {
                        for (String s : stringShapeMap.keySet()) {
                                sum += stringShapeMap.get(s).getSize();
                        }
                }
                return sum;

        }

        public static void main(String[] args) {
                Shape pentagon = new Pentagon();
                pentagon.setName("Pentagon1");
                pentagon.setSize(10);
                Shape square = new Square();
                square.setName("Square1");
                square.setSize(5);

                List<Map<String, Shape>> list = new ArrayList<>();
                HashMap<String, Shape> hashMap = new HashMap<>();
                hashMap.put(pentagon.getName(), pentagon);
                hashMap.put(square.getName(), square);
                list.add(hashMap);

                ListMapSumCalculator<List<Map<String, Shape>>> listMapSumCalculator = new ListMapSumCalculator<>();
                System.out.println(listMapSumCalculator.calculateAndPrint(list));
        }
}

class Shape {
       private int size;
       private String name;

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getSize() {
                return size;
        }

        public void setSize(int size) {
                this.size = size;
        }
}

class Pentagon extends Shape {

}

class Square extends Shape {

}
