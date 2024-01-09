package com.kn.exception9;

import java.util.Scanner;

public class DrivingLiscence {

	public static void main(String[] args) {
		System.out.println("--->Liscence application started<---");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = scan.nextInt();
		try {
			eligible(age);
		} catch (NotEligibleException e) {
			e.printStackTrace();
		}
		scan.close();
	}

	private static void eligible(int age) throws NotEligibleException {
		if (age >= 18 && age <= 70) {
			System.out.println("Eligible for liscence");
		} else if (age < 18 || age > 70) {
			System.out.println("Not Eligible for liscence");
			throw new NotEligibleException("Age not eligible");
		}
	}

}
