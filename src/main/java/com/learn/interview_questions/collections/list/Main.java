package com.learn.interview_questions.collections.list;

import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//ArrayList is based on array. Linked list consists of nodes. Every node has link to prevois and next element.
//Search:
//ArrayList is constant (o(n)) here as it gets by index. Linked list is constant just for first or last element.
//LinkedListis linier for search in the middle as it needs to iterate from start (or end).
//
//Insertion:
//ArrayList is constant here just in case of insertion to the end as it doesn't need to reindex elements which are
//on the right side from the target position. Linked list is constant in case of start and end insertion.
//
//Deletion:
//ArrayList is constant here just in case last element deletion. Linked list is constant for first and last.

public class Main {
    public static void main(String[] args) {
        ArrayList<String> aStrings2 = new ArrayList<>();
        LinkedList<String> aStrings = new LinkedList<>();
        aStrings.add("1)");
        aStrings.get(0);
    }
}
