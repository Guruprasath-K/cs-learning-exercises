package com.packages.java;

public class ForDemo1 {

	public static void main(String[] args) {
		int j = 0;
		int i = 1;
		for (System.out.println("Initialization"); i <= 10; System.out.println("Inc/Dec")) {
			System.out.println(i);
			System.out.println(j);
			i++;
			j++;
		}
		System.out.println("--- The End ---");
	}

}
