package com.learn.patterns.behavioral.mediator.trainings;

public abstract class Collegue {
	private Mediator mediator;

	public Collegue(Mediator mediator) {
		this.mediator = mediator;
	}

	public abstract void land();
	public abstract void receive();
}
