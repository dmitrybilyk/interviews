package com.learn.interview_questions.patterns.structural.adapter.ducks;

public class DuckAdapter implements Turkey {
	private Duck duck;

	public DuckAdapter(Duck duck) {
		this.duck = duck;
	}

	public void gobble() {
		duck.quack();
	}

	public void fly() {
		duck.fly();
	}
}
