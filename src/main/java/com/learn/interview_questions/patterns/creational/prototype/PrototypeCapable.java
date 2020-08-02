package com.learn.interview_questions.patterns.creational.prototype;

public interface PrototypeCapable extends Cloneable
{
    public PrototypeCapable clone() throws CloneNotSupportedException;
}