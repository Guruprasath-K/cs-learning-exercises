package com.kn.nestloops;

public class PatternOfLetters1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if ((i + j) <= 6) {
					System.out.print((char) (70 - j) + " ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

//E D C B A 
//E D C B 
//E D C 
//E D 
//E 
