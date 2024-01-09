package com.kn.aggression;

public class Airline {

	String airlineName;
	Pilot pilot;

	public void operate() {
		System.out.println(this.airlineName + " is operating...");
		pilot.fly();
	}

	public Airline(String airlineName, Pilot pilot) {
		this.airlineName = airlineName;
		this.pilot = pilot;
	}


}
