package com.kn.typeofcharacters;

public class TypeOfCharacters {

	public void typeOfCharacters(String inputString) {

		char[] crr = inputString.toCharArray();

		int countVowels = 0;
		int countConsonant = 0;
		System.out.println("Upper Case:");
		for (int i = 0; i < crr.length; i++) {
			if (crr[i] >= 65 && crr[i] <= 90) {
				if (crr[i] == 'A' || crr[i] == 'E' || crr[i] == 'I' || crr[i] == 'O' || crr[i] == 'U') {
					countVowels++;
				} else {
					countConsonant++;
				}
			}
		}
		System.out.println("Vowels: " + countVowels);
		countVowels = 0;
		System.out.println("Consonants: " + countConsonant);
		countConsonant = 0;
		System.out.println("*********************************");

		System.out.println("Lower Case:");
		for (int i = 0; i < crr.length; i++) {
			if (crr[i] >= 97 && crr[i] <= 122) {
				if (crr[i] == 'a' || crr[i] == 'e' || crr[i] == 'i' || crr[i] == 'o' || crr[i] == 'u') {
					countVowels++;
				} else {
					countConsonant++;
				}
			}
		}
		System.out.println("Vowels: " + countVowels);
		countVowels = 0;
		System.out.println("Consonants: " + countConsonant);
		countConsonant = 0;
		System.out.println("*********************************");
		
		int countNumbers = 0;
		int countSpace = 0;
		int countSpChar = 0;
		for (int i = 0; i < crr.length; i++) {
			if (crr[i] >= 48 && crr[i] <= 57) {
				countNumbers++;
			} else if (crr[i] == 32) {
				countSpace++;
			} else {
				countSpChar++;
			}
		}
		System.out.println("Digits: " + countNumbers);
		System.out.println("*********************************");
		
		System.out.println("Space: " + countSpace);
		System.out.println("*********************************");

		System.out.println("Special Characters: " + countSpChar);
		System.out.println("*********************************");

	}

}
