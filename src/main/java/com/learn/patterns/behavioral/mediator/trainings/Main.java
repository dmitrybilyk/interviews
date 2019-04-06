package com.learn.patterns.behavioral.mediator.trainings;

public class Main {
	public static void main(String[] args) {
		MediatorLandingImpl mediator = new MediatorLandingImpl();
		Collegue collegue = new Plane("one", mediator);
		Collegue collegue2 = new Plane("two", mediator);
		Collegue collegue3 = new Plane("three", mediator);
		mediator.addCollegu(collegue);
		mediator.addCollegu(collegue2);
		mediator.addCollegu(collegue3);
		mediator.land(collegue3);
	}
}
