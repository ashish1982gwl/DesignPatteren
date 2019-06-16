package com.ashish.creational.singleTonDesignPatteren;

public class SingletonScalable {
private SingletonScalable(){}
	
	private static class  InnerClass{
		final static  SingletonScalable instance=new SingletonScalable();
	} 
	public static SingletonScalable getInstance(){
		return SingletonScalable.InnerClass.instance;
	}
}
