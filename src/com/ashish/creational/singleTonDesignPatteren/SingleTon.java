package com.ashish.creational.singleTonDesignPatteren;

public class SingleTon {
	@Override
	public String toString() {
		return "SingleTon []";
	}

	private SingleTon() {
	}

	private static volatile SingleTon singleTon = null;

	public static SingleTon getInstance() {
		if (singleTon == null) {
			synchronized (SingleTon.class) {
				singleTon = new SingleTon();
			}
		}
		return singleTon;
	}
//Use Case	
//Runtime.getRuntime();
//SpringBean
//Logger

}
