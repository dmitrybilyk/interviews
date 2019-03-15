package com.learn.patterns.behavioral.state.trainings2;

public class AwakeState extends HumanState {
	@Override
	public void doSomeAction() {
		System.out.println("I'm awake");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		humanContext.setHumanState(new DreamingState());
		humanContext.doSomeAction();
	}
}
