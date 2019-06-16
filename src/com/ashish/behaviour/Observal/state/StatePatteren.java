package com.ashish.behaviour.Observal.state;

public class StatePatteren {
	State State;

	StatePatteren(State State) {
		this.State = State;
	}

	public void action() {
		State.doAction();
	}
}
