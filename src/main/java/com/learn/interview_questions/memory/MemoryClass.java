package com.learn.interview_questions.memory;

// Objects are stored in heap. Primitives, local variables, references to objects used in method are stored in stack.
//Stack memory consists of blocks which are allocated in LIFO order
// There are several parts in Heap depending on how many times object survived during the garbage collection.
//You may trigger System.gc() or Runtime.gc() but there is no guarantee jvm will clean at once.

public class MemoryClass {

    public static void main(final String[] args) {
        int i = 0;
        MemoryClass memoryClass = new MemoryClass();
        memoryClass.myMethod(memoryClass);
    }

    private void myMethod(final Object obj) {
        int i = 1;
        String s = "HelloWorld!";

    }

}