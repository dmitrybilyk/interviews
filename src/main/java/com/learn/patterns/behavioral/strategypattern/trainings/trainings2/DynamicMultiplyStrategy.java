package com.learn.patterns.behavioral.strategypattern.trainings.trainings2;

public class DynamicMultiplyStrategy implements SalaryCalculationStrategy {
	private int factor;

	public DynamicMultiplyStrategy(int factor) {
		this.factor = factor;
	}

	@Override
	public int calculateSalary(int main, int bonus) {
		return (main + bonus) * factor;
	}
}
