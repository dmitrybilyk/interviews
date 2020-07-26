package com.learn.interview_questions.patterns.structural.decorator.decoratorimpl;

import com.learn.interview_questions.patterns.structural.decorator.Beverage;
import com.learn.interview_questions.patterns.structural.decorator.CondimentDecorator;

public class Milk extends CondimentDecorator {
	Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	public double cost() {
		return .10 + beverage.cost();
	}
}
