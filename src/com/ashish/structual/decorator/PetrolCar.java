package com.ashish.structual.decorator;

public class PetrolCar extends BasicCar{

	public void addPetrolEngine(Car car) {
		car.getCarEngine();
		System.out.println("Add Petrol Engine");
		
	}

}
