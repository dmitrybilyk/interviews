package com.learn.core.multithreading.concurrency.cookbook.multuplying;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by dmitry on 01.03.15.
 */
public class Main {
  public static void main(String[] args) {
    Thread threads[] = new Thread[10];
    Thread.State status[] = new Thread.State[10];
    for (int i = 1; i <= 10; i++) {
      threads[i] = new Thread(new Calculator(i));
      if ((i%2) == 0) {
        threads[i].setPriority(Thread.MAX_PRIORITY);
      } else {
        threads[i].setPriority(Thread.MIN_PRIORITY);
      }
      FileWriter file = null;
      PrintWriter pw = null;
      try {
        file = new FileWriter(".\\data\\log.txt");
        pw = new PrintWriter(file);
      } catch (IOException e) {
        e.printStackTrace();
      }

      for (int j=0; j<10; j++){
        pw.println("Main : Status of Thread "+j+" : " +
                threads[j].getState());
        status[j]=threads[j].getState();
      }

      for (int k=0; k<10; k++){
        threads[k].start();
      }


//      boolean finish=false;
//      while (!finish) {
//        for (int i=0; i<10; i++){
//          if (threads[i].getState()!=status[i]) {
//            writeThreadInfo(pw, threads[i],status[i]);
//            status[i]=threads[i].getState();
//          }
//        }
//        finish=true;
//        for (int i=0; i<10; i++){
//          finish=finish &&(threads[i].getState()==State.TERMINATED);
//        }
//      }



      threads[i].setName("Thread " + i);
      Calculator calculator = new Calculator(i);
      Thread thread = new Thread(calculator);
      thread.start();
    }
//
//    private static void writeThreadInfo(PrintWriter pw, Thread
//    thread, State state) {
//      pw.printf("Main : Id %d - %s\n",thread.getId(),thread.getName());
//      pw.printf("Main : Priority: %d\n",thread.getPriority());
//      pw.printf("Main : Old State: %s\n",state);
//      pw.printf("Main : New State: %s\n",thread.getState());
//      pw.printf("Main : ************************************\n");
//    }

  }
}
