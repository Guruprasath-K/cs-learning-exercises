package com.guru.oops2;

public class Fan {

	// state
	private String make;
	private double radius;
	private String colour;

	private boolean isOn;
	private byte speed;

	// creation
	public Fan(String make, double radius, String colour) {
		this.make = make;
		this.radius = radius;
		this.colour = colour;
	}

	// behavior
	public void switchOn() {
		this.isOn = true;
		setSpeed((byte) 5);
	}

	public void switchOff() {
		this.isOn = false;
		setSpeed((byte) 0);
	}

	public void setSpeed(byte speed) {
		this.speed = speed;
	}

	// print the state
	@Override
	public String toString() {
		return String.format("make - %s, radius - %f , colour - %s, isOn - %b, speed - %d", make, radius, colour, isOn,
				speed);
	}

}
