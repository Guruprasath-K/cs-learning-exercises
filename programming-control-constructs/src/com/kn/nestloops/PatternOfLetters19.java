package com.kn.nestloops;

public class PatternOfLetters19 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j >= i) {
					System.out.print((char) (70 - j) + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}

//E D C B A 
//  D C B A 
//    C B A 
//      B A 
//        A 