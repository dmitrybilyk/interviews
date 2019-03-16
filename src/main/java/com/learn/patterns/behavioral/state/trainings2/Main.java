package com.learn.patterns.behavioral.state.trainings2;

public class Main {
	public static void main(String[] args) {
		HumanContext humanContext = new HumanContext();
		humanContext.setHumanState(new AwakeState());
		humanContext.doSomeAction();
	}
}
