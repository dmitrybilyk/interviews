package com.learn.patterns.behavioral.mediator.trainings;

public class Plane extends Collegue {
	private String name;

	public Plane(String name, Mediator mediator) {
		super(mediator);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void land() {
		System.out.println(name + "is landing");
	}

	@Override
	public void receive() {
		System.out.println("flight " + name + "received the message");
	}
}
