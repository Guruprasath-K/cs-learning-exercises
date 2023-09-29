package com.kn.nestloops;

public class PatternOfLetters20 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j >= (6 - i)) {
					System.out.print((char) (70 - j) + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}

//        A 
//      B A 
//    C B A 
//  D C B A 
//E D C B A 