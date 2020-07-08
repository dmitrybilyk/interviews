package com.learn.patterns.structural.proxy.trainings2;

import java.util.Arrays;
import java.util.List;

public class SomeServiceImpl implements SomeService {
	List<String> someObjects = Arrays.asList("Dima", "Lena");
	@Override
	public String getSomeObject(String name) throws InterruptedException {
		Thread.currentThread().sleep(2000);
		System.out.println("getting object for name " + name);
		return someObjects.stream().filter(s -> s.equals(name)).findFirst().orElse("default");
	}
}
