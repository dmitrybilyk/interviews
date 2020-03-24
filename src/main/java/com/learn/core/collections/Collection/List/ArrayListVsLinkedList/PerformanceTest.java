package com.learn.core.collections.Collection.List.ArrayListVsLinkedList;

import org.openjdk.jmh.Main;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Threads;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.infra.Blackhole;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Fork(1)
@Warmup(iterations = 10)
@Measurement(iterations = 10)
@BenchmarkMode(Mode.AverageTime)
@Threads(1)
@State(Scope.Benchmark)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class PerformanceTest {
   private static List<Object> arrayList;
   private static List<Object> linkedList;

   private static final int count = 100_000;

   public static void main(String[] args) throws Exception {
    Main.main(args);
   }

   @Setup
   public static void setup() {
      arrayList = new ArrayList<>(count);
      linkedList = new LinkedList<>();

      for (int i = 0; i < count; i++)
         arrayList.add(new Object());

      linkedList.addAll(arrayList);
   }

   @Benchmark
   public void removeFromLinkedList(Blackhole blackhole) throws Exception {
      Object object = new Object();
      linkedList.remove(count / 2);
      linkedList.add(count / 2, object);
   }

   @Benchmark
   public void removeFromArrayList(Blackhole blackhole) throws Exception {
      Object object = new Object();
      arrayList.remove(count / 2);
      arrayList.add(count / 2, object);
   }
} 