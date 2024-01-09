package com.kn.aggression;

public class Pilot {

	String name;

	public void fly() {
		System.out.println(this.name + " pilot is flying...");
	}

	public Pilot(String name) {
		this.name = name;
	}

}
