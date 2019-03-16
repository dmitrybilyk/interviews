package com.learn.patterns.structural.proxy.trainings2;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		SomeService someService = new SomeServiceProxy();
		System.out.println(someService.getSomeObject("Dima"));
		System.out.println(someService.getSomeObject("Dima"));
		System.out.println(someService.getSomeObject("Lena"));
	}
}
