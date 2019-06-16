package com.ashish.creational.singleTonDesignPatteren;

public class SingleTonEger {
	private SingleTonEger(){
		System.out.println("Constructor has been calculated ");
	}
	private static SingleTonEger instatnce =new SingleTonEger();
	public static SingleTonEger getInstance(){
		return instatnce;
	}

}
