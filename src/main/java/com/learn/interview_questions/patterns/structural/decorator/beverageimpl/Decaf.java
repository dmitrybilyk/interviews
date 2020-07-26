package com.learn.interview_questions.patterns.structural.decorator.beverageimpl;

import com.learn.interview_questions.patterns.structural.decorator.Beverage;

public class Decaf extends Beverage {
	public Decaf() {
		description = "Decaf Coffee";
	}
 
	public double cost() {
		return 1.05;
	}
}

