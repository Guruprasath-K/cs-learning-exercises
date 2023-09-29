package com.kn.nestloops;

public class PatternOfStars1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) { // Rows
			for (int j = 1; j <= 5; j++) { // Columns
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}

//*  *  *  *  * 
//*  *  *  *  * 
//*  *  *  *  *