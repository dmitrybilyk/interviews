package com.learn.core.collections.Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by bid on 8/21/14.
 */

// Queue implemented in the FIFO way
public class QueueMain
{
   public static void main(String[] args)
   {
      Queue<String> queue = new LinkedList<>();
      queue.add("First");
      queue.add("Second");
      queue.add("Third");

      System.out.println(queue.peek());


      Queue<Integer> integerQueue = new LinkedBlockingDeque<Integer>();
      integerQueue.add(1);
      integerQueue.add(2);
      integerQueue.add(3);

      System.out.println(integerQueue.poll());
   }
}
