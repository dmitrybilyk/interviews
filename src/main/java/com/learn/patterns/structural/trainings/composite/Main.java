package com.learn.patterns.structural.trainings.composite;

/**
 * Created by dmitry on 24.01.17.
 */
public class Main {
  public static void main(String[] args) {
    Directory directory = new Directory();
//    directory.setSize(32000);
    File file1 = new File();
    file1.setSize(34);
    directory.addItem(file1);
    Directory childDirectory = new Directory();
//    childDirectory.setSize(45);
    File childFile = new File();
    childFile.setSize(333);
    childDirectory.addItem(childFile);
    File childFile2 = new File();
    childFile2.setSize(333);
    childDirectory.addItem(childFile2);
    directory.addItem(childDirectory);

    System.out.println(directory.getSize());
  }
}
