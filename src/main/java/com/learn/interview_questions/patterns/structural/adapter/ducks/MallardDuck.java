package com.learn.interview_questions.patterns.structural.adapter.ducks;

public class MallardDuck implements Duck {
	public void quack() {
		System.out.println("Duck Quack");
	}
 
	public void fly() {
		System.out.println("Duck - I'm flying");
	}
}
