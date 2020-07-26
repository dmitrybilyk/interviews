package com.learn.interview_questions.patterns.structural.decorator.beverageimpl;

import com.learn.interview_questions.patterns.structural.decorator.Beverage;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
 
	public double cost() {
		return .99;
	}
}

