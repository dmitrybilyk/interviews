package com.learn.patterns.behavioral.strategypattern.trainings.trainings2;

public class MultiplyTwoStrategy implements SalaryCalculationStrategy {
	@Override
	public int calculateSalary(int main, int bonus) {
		return (main + bonus) * 2;
	}
}
