package com.learn.core.multithreading.baeldung.countdownlatch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main {
        public static void main(String[] args) throws InterruptedException {
                // Given
                List<String> outputScraper = Collections.synchronizedList(new ArrayList<>());
                CountDownLatch countDownLatch = new CountDownLatch(5);
                List<Thread> workers = Stream.generate(() -> new Thread(new Worker(outputScraper, countDownLatch)))
                        .limit(5)
                        .collect(toList());

                // When
                workers.forEach(Thread::start);
                countDownLatch.await(); // Block until workers finish
                outputScraper.add("Latch released");
        }
}
