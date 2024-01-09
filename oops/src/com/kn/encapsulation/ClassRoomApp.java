package com.kn.encapsulation;

import java.util.Scanner;

public class ClassRoomApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the temperature: ");
		int temperature = scan.nextInt();

		ClassRoom c1 = new ClassRoom();

		System.out.println("Temperature = " + c1.getTemperature());
		c1.setTemperature(temperature);
		System.out.println("Modified Temperature = " + c1.getTemperature());

		scan.close();
	}

}
