package com.learn.other.other;

/**
 * Created by dmitry on 08.04.15.
 */
public class Main {
  public static void main(String[] args) {
//    int alreadyDeleted = 6;
    int totalSize = 300;
    int till100 = 0;
    int previousAnswer = 0;

    for (int i = 0; i<=totalSize; i++) {

      int answer = (i*100/totalSize);
      if (answer != previousAnswer) {
        till100 += 1;
        previousAnswer = answer;
        System.out.println(till100);
      }
    }
  }
}
