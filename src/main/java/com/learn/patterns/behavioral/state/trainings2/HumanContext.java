package com.learn.patterns.behavioral.state.trainings2;

public class HumanContext {
	private HumanState humanState = new AwakeState();

	public void setHumanState(HumanState humanState) {
		humanState.setContext(this);
		this.humanState = humanState;
	}

	public void doSomeAction() {
		humanState.doSomeAction();
	}
}
