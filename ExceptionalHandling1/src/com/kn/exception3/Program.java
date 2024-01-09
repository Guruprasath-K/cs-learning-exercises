package com.kn.exception3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		System.out.println("Program execution started !");
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Enter the size of Array");
			int[] arr = new int[scan.nextInt()];
			System.out.println("Enter the index");
			int index = scan.nextInt();
			System.out.println("Enter the element");
			int element = scan.nextInt();
			System.out.println("Enter the numerator");
			int numerator = scan.nextInt();
			System.out.println("Enter the denominator");
			int denominator = scan.nextInt();
			double division = numerator / denominator;
		} catch (ArithmeticException ae) {
			System.out.println("Denominator must be zero");
			ae.printStackTrace();
		} catch (InputMismatchException ime) {
			System.out.println("Numeric input expected");
			ime.printStackTrace();
		} catch (NegativeArraySizeException nase) {
			System.out.println("Array size must be a positive value");
			nase.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception Occured");
			e.printStackTrace();
		} finally {
			scan.close();
			System.out.println("Scanner closed successfully");
		}
		System.out.println("Program execution ended!");
	}

}
