package com.kn.nestloops;

public class PatternOfLetters11 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j <= (6 - i)) {
					System.out.print((char) (64 + j) + " ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

//A B C D E 
//A B C D  
//A B C   
//A B    
//A     
