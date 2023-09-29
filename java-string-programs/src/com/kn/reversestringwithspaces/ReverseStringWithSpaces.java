package com.kn.reversestringwithspaces;

public class ReverseStringWithSpaces {

	public String reverseStringWithSpaces(String inputString) {
		char[] crr = inputString.toCharArray();
		char[] reversedArray = new char[crr.length];

		for (int i = 0; i < crr.length; i++) {
			if (crr[i] != ' ') {
				reversedArray[i] = crr[crr.length - 1 - i];
			} else {
				reversedArray[i] = ' ';
			}
		}
		String result = reversedArray.toString();

		return result;
	}

}
