package com.kn.nestloops;

public class PatternOfLetters3 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print((char) (64 + j) + " ");
			}
			System.out.println();
		}
	}

}

//A B C D E 
//A B C D E 
//A B C D E 
//A B C D E 
//A B C D E 
