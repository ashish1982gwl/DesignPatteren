package com.ashish.structual.decorator;

public class DecoratorPatternTest {
	public static void main(String[] args) {
		Car car = new BasicCar();
		DiselCar diselCar = new DiselCar();
		diselCar.addDiselEngine(car);
		PetrolCar petrolCar = new PetrolCar();
		petrolCar.addPetrolEngine(car);
	}
}
