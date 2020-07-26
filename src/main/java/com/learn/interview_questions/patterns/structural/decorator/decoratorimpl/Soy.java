package com.learn.interview_questions.patterns.structural.decorator.decoratorimpl;

import com.learn.interview_questions.patterns.structural.decorator.Beverage;
import com.learn.interview_questions.patterns.structural.decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {
	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public double cost() {
		return .15 + beverage.cost();
	}
}
