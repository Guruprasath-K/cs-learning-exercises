package com.guru.conditionals;

public class SwitchExerciseRunner {

	public static void main(String[] args) {
		System.out.println(determineNameOfDay(9));
	}

	public static String determineNameOfDay(int dayNumber) {
		switch (dayNumber) {
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		}

		return "Invalid_Day";
	}

}
