package com.guru.conditionals;

public class NameOfTheMonth {

	public static void main(String[] args) {
		System.out.println(isWeekDay(4));
	}

	public static boolean isWeekDay(int dayNumber) {
		switch (dayNumber) {
		case 1:
		case 7:
			return false;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			return true;
		}

		return false;
	}

	public static String determineNameOfMonth(int monthNumber) {
		switch (monthNumber) {
           case 1:
   			return "January";
   		case 2:
   			return "February";
   		case 3:
   			return "March";
   		case 4:
   			return "April";
   		case 5:
   			return "May";
   		case 6:
   			return "June";
   		case 7:
   			return "July";
           }
           
			return "Invalid Month";
	}


}
