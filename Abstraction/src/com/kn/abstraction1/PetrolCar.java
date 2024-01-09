package com.kn.abstraction1;

public class PetrolCar extends Car {

	@Override
	public void refuel() {
		System.out.println("Car is refueled with Petrol...");
	}

	@Override
	public void race() {
		System.out.println("Car is racing...");
	}

}
