package com.ashish.behaviour.Observal.state;

public class StateDesignPatternExample {
	public static void main(String a[]) {

		State OnState = new TvOn();
		StatePatteren patteren = new StatePatteren(OnState);
		patteren.action();

		State OffState = new TvOff();
		patteren = new StatePatteren(OffState);
		patteren.action();
	}
}
