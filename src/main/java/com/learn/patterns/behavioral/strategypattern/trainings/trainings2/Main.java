package com.learn.patterns.behavioral.strategypattern.trainings.trainings2;

public class Main {
	public static void main(String[] args) {
		SomeSalaryCalculator someSalaryCalculator = new SomeSalaryCalculator(new DynamicMultiplyStrategy(5));
		System.out.println(someSalaryCalculator.calculateSalary(100, 50));
	}
}
