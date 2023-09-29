package com.program;

import java.util.Scanner;

public class AdditionOperation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Integer Value");
		int i = scan.nextInt();
		System.out.println("Enter the Double Value");
		double d = scan.nextDouble();
		System.out.println("Addition = " + (i + d));
	}

}

