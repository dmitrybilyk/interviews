package com.learn.interview_questions.patterns.structural.decorator.beverageimpl;

import com.learn.interview_questions.patterns.structural.decorator.Beverage;

public class Espresso extends Beverage {
  
	public Espresso() {
		description = "Espresso";
	}
  
	public double cost() {
		return 1.99;
	}
}

