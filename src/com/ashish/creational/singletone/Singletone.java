package com.ashish.creational.singletone;

public class Singletone {
	private static Singletone singletone=null;

	private Singletone() {
	}

	public static Singletone getInstance() {
		if (singletone == null) {
			System.out.println("---Creating new object ---");
			singletone = new Singletone();
			return singletone;
		}
		System.out.println("---Get old object ---");

		return singletone;
	}

	@Override
	public String toString() {
		return "";
	}
}
