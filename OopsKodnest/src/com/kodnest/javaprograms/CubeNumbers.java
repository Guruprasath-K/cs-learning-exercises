package com.kodnest.javaprograms;

import java.util.Scanner;

public class CubeNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number to cube : ");
		int num = scan.nextInt();

		int cube = cubeNumbers(num);
		System.out.println("The Cube of Numbers = " + cube);
		scan.close();
	}

	public static int cubeNumbers(int num) {
		return num * num * num;
	}

}
