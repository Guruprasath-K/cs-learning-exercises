package com.guru.arrays;

public class StringRunner {

	public static void main(String[] args) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String dayWithTheMostCharacters = "";
        
        for (String day:daysOfWeek) {
        	if (day.length()>dayWithTheMostCharacters.length()) {
				dayWithTheMostCharacters = day;
			}	
        }

	      System.out.println("Day with the most number of characters: " + dayWithTheMostCharacters);

	      for (int i = daysOfWeek.length - 1; i >= 0; i--) {
	    	  System.out.println(daysOfWeek[i]);
	      }

}

}
