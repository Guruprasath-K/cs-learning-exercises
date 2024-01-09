package com.kn.abstraction1;

abstract public class DieselCar extends Car {

	@Override
	public void refuel() {
		System.out.println("Car has been refueled with diesel...");

	}

	@Override
	public abstract void race();

}
