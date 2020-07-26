package com.learn.interview_questions.patterns.structural.decorator.beverageimpl;

import com.learn.interview_questions.patterns.structural.decorator.Beverage;

public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "House Blend Coffee";
	}
 
	public double cost() {
		return .89;
	}
}

