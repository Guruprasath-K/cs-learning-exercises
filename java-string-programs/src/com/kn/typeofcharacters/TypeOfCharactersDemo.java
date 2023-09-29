package com.kn.typeofcharacters;

import java.util.Scanner;

public class TypeOfCharactersDemo {

	public static void main(String[] args) {
		// Take Input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String inputString = scan.nextLine();

		// Create object of TypeOfCharacters Class
		TypeOfCharacters type = new TypeOfCharacters();

		// Call the method to find the type of characters
		type.typeOfCharacters(inputString);

		// Release Resources
		scan.close();
	}

}
