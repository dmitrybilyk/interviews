package com.learn.patterns.behavioral.mediator.trainings;

import java.util.ArrayList;
import java.util.List;

public class MediatorLandingImpl implements Mediator{
	private List<Collegue> collegues = new ArrayList<>();

	public MediatorLandingImpl() {
	}

	public void addCollegu(Collegue collegue) {
		collegues.add(collegue);
	}

	@Override
	public void land(Collegue collegue) {
		for (Collegue flight : collegues) {
			if (!collegue.equals(flight)) {
				flight.receive();
			}
		}
	}
}
