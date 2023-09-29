package com.kn.nestloops;

public class PatternOfLetters14 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j <= i) {
					System.out.print((char) (70 - i) + " ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
	}
	}

}

//E     
//D D    
//C C C   
//B B B B  
//A A A A A 