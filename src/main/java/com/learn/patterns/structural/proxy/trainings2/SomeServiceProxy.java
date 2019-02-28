package com.learn.patterns.structural.proxy.trainings2;

import java.util.ArrayList;
import java.util.List;

public class SomeServiceProxy implements SomeService {

	private SomeService someService;

	private List<String> cachedObjects = new ArrayList<>();

	public SomeServiceProxy() {
		someService = new SomeServiceImpl();
	}

	@Override
	public String getSomeObject(String name) throws InterruptedException {
		String result = cachedObjects.stream().filter(s -> s.equals(name)).findFirst().orElse(null);
		if (result != null) {
			return result;
		} else {
			String someObject = someService.getSomeObject(name);
			cachedObjects.add(someObject);
			return someObject;
		}
	}
}
