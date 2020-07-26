package com.learn.interview_questions.patterns.structural.decorator.decoratorimpl;

import com.learn.interview_questions.patterns.structural.decorator.Beverage;
import com.learn.interview_questions.patterns.structural.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
	Beverage beverage;
 
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
 
	public double cost() {
		return .20 + beverage.cost();
	}
}
