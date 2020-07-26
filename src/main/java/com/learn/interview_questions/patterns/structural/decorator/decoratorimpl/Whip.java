package com.learn.interview_questions.patterns.structural.decorator.decoratorimpl;

import com.learn.interview_questions.patterns.structural.decorator.Beverage;
import com.learn.interview_questions.patterns.structural.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
	Beverage beverage;
 
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
 
	public double cost() {
		return .10 + beverage.cost();
	}
}
