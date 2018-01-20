package com.ashish.structual.decorator;

public class DiselCar extends BasicCar{

	public void addDiselEngine(Car car) {
		car.getCarEngine();
		System.out.println("Add disel Engine");
		
	}

}
