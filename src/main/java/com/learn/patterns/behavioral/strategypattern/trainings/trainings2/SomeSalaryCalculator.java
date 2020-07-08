package com.learn.patterns.behavioral.strategypattern.trainings.trainings2;

public class SomeSalaryCalculator {
	public SomeSalaryCalculator(SalaryCalculationStrategy salaryCalculationStrategy) {
		this.salaryCalculationStrategy = salaryCalculationStrategy;
	}

	private SalaryCalculationStrategy salaryCalculationStrategy;
	public int calculateSalary(int main, int bonus) {
		return salaryCalculationStrategy.calculateSalary(main, bonus);
	}
}
