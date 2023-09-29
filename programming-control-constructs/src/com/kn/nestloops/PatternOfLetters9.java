package com.kn.nestloops;

public class PatternOfLetters9 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j >= (6 - i)) {
					System.out.print((char) (64 + i) + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}

//        A 
//      B B 
//    C C C 
//  D D D D 
//E E E E E 
