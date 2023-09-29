package com.kn.nestloops;

public class PatternOfNumbers4 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j>=i) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
	}
}
}

//1 2 3 4 5 
//2 3 4 5 
//3 4 5 
//4 5 
//5 