package com.learn.patterns.structural.composite.trainings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmitry on 06.03.17.
 */
public class Directory extends Item {
    private List<Item> itemList = new ArrayList<>();

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void clear() {
        itemList.clear();
    }

    @Override
    public void printInfo() {
        System.out.println("dir name - " + name);
        int size = 0;
        for (Item item : itemList) {
            item.printInfo();
            size += item.getSize();
        }
        System.out.println(size);
    }
}
