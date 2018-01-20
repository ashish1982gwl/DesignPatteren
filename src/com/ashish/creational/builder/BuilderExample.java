package com.ashish.creational.builder;

import com.ashish.creational.factory.OsFactory;
import com.ashish.creational.factory.OsFactoryInf;

public class BuilderExample {
	public static void main(String[] args) {
		
		Phone phone=new PhoneBuilder().setBattery(3000).setOs("Android").getPhone();
		System.out.println(phone);
	}
}
