package com.kn.abstraction1;

abstract public class Car {

	public void start() {
		System.out.println("Car has been started...");
	}

	public void stop() {
		System.out.println("Car has been stopped...");
	}

	public abstract void refuel();

	public abstract void race();
}
