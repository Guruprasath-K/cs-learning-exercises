package com.kn.aggression;

public class AggressionDemo {

	public static void main(String[] args) {

		Pilot pilot1 = new Pilot("John");
		Airline airline = new Airline("Emirates", pilot1);

		airline.operate();

		airline = null; // Owner has been shutdown
		System.out.println("-----> Airline has been shut down!!!");
		pilot1.fly();
	}

}
