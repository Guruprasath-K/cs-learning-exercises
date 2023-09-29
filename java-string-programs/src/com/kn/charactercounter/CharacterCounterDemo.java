package com.kn.charactercounter;

import java.util.Scanner;

public class CharacterCounterDemo {

	public static void main(String[] args) {
		// Take Input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String inputString = scan.nextLine();

		// Create object of CharacterCounter Class
		CharacterCounter counter = new CharacterCounter();
		
		//Call the method to count the character
		counter.characterCount(inputString);



		// Release resources
		scan.close();

	}

}
