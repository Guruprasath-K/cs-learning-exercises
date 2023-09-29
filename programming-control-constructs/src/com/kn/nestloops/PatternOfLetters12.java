package com.kn.nestloops;

public class PatternOfLetters12 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j >= i) {
					System.out.print((char) (64 + j) + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}

//A B C D E 
//  B C D E 
//    C D E 
//      D E 
//        E 
