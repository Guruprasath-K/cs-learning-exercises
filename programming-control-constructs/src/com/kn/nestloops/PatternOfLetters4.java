package com.kn.nestloops;

public class PatternOfLetters4 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print((char) (70 - i) + " ");
			}
			System.out.println();
		}
	}

}

//E E E E E 
//D D D D D 
//C C C C C 
//B B B B B 
//A A A A A 
