package com.learn.patterns.behavioral.state.trainings2;

public abstract class HumanState {
	protected HumanContext humanContext;
	public abstract void doSomeAction();

	public void setContext(HumanContext humanContext) {
		this.humanContext = humanContext;
	}
}
