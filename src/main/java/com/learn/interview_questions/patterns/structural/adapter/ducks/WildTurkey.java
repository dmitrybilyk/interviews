package com.learn.interview_questions.patterns.structural.adapter.ducks;

public class WildTurkey implements Turkey {
	public void gobble() {
		System.out.println("Gobble gobble - wild Turkey");
	}
 
	public void fly() {
		System.out.println("I'm flying a short distance - wild Turkey");
	}
}
