package com.kn.exception7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

	public static void main(String[] args) {
		System.out.println("Program started...");
		try {
			takeInput();
		} catch (IOException e) {
			System.out.println("Exception handled in main() method");
			e.printStackTrace();
		}
		System.out.println("Program ended");
	}

	private static void takeInput() throws IOException {
		System.out.println("takeInput() method started");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input = br.readLine();
		System.out.println("Input = " + input);
	}

}
