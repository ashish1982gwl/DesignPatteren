package com.ashish.creational.factory;

//Creational Design Patteren

public class FactoryDemo {

	public static void main(String[] args) {
		OsFactory OsFactory = new OsFactory();
		OsFactoryInf inf = OsFactory.getOs("windows");
		inf.showOsName();
	}

}
