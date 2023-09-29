package com.kodnest.javaprograms;

import java.util.Scanner;

public class SecretMessageDecoder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Message Character: ");
		char ch = scan.next().charAt(0);

		int message = decodeCharacter(ch); // System.out.println("The Decoded Message = " + decodeCharacter(ch));
		System.out.println("The Decoded Message = " + message);
		scan.close();
	}

	public static int decodeCharacter(char ch) {
		return ch; // (int)ch

	}

}
