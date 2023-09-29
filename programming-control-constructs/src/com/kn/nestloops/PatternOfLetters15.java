package com.kn.nestloops;

public class PatternOfLetters15 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j <= (6 - i)) {
					System.out.print((char) (70 - i) + " ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

//E E E E E 
//D D D D  
//C C C   
//B B    
//A