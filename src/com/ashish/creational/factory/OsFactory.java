package com.ashish.creational.factory;

public class OsFactory {

	public OsFactoryInf getOs(String str) {

		if (str.equalsIgnoreCase("Windows")) {

			return new Widow();
		}
		if (str.equalsIgnoreCase("Android")) {

			return new Android();
		}
		if (str.equalsIgnoreCase("IOS")) {

			return new Ios();
		}
		return null;
	}

}
