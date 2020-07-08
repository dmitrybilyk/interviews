package com.learn.core.multithreading.baeldung.countdownlatch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MainWaitingWorker {
        public static void main(String[] args) throws InterruptedException {
                List<String> outputScraper = Collections.synchronizedList(new ArrayList<>());
                CountDownLatch readyThreadCounter = new CountDownLatch(5);
                CountDownLatch callingThreadBlocker = new CountDownLatch(1);
                CountDownLatch completedThreadCounter = new CountDownLatch(5);
                List<Thread> workers = Stream
                        .generate(() -> new Thread(new WaitingWorker(outputScraper, readyThreadCounter, callingThreadBlocker, completedThreadCounter))).limit(5).collect(toList());

                // When
                workers.forEach(Thread::start);
                readyThreadCounter.await(); // Block until workers start
                outputScraper.add("Workers ready");
                callingThreadBlocker.countDown(); // Start workers
                completedThreadCounter.await(); // Block until workers finish
                outputScraper.add("Workers complete");
        }
}
