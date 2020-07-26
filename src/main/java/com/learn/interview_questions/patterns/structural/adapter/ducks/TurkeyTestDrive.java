package com.learn.interview_questions.patterns.structural.adapter.ducks;

//When we have some method with some functionality but we get not what we want - we can adapt that to become acceptable
//for our method.
public class TurkeyTestDrive {
	public static void main(String[] args) {
		Turkey turkey = new WildTurkey();
		//We have a turkey
		weWantTheTurkeyForAChristmasHere(turkey);

		//We don't have a turkey but duck is also good, adapt it to be like turkey
		Duck duck = new MallardDuck();
		//DuckAdapter should give us a turkey-like duck, so we should implement target interface - Turkey,
		//then to pass duck to it, duck will be a field in an adapter. And then in implemented methods of
		//Turkey we trigger actions of duck on that duck field.
		Turkey duckLikeTurkeyAdapter = new DuckAdapter(duck);
		weWantTheTurkeyForAChristmasHere(duckLikeTurkeyAdapter);
	}

	static void weWantTheTurkeyForAChristmasHere(Turkey turkey) {
		turkey.gobble();
	}
}
