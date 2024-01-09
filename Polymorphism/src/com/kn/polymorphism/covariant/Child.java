package com.kn.polymorphism.covariant;

public class Child extends Parent {

	@Override
	public NexonCar display() {
		return new NexonCar();
	}

}
