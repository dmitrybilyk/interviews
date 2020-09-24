package com.learn.interview_questions.patterns.structural.decorator;

public abstract class Beverage {
	protected String description = "Unknown Beverage";
  
	public String getDescription() {
		return description;
	}

	public abstract double cost();
}
