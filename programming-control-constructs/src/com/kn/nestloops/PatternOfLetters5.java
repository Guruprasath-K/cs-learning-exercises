package com.kn.nestloops;

public class PatternOfLetters5 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print((char) (70 - j) + " ");
			}
			System.out.println();
		}
	}

}

//E D C B A 
//E D C B A 
//E D C B A 
//E D C B A 
//E D C B A 