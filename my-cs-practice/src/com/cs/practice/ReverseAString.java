package com.cs.practice;

public class ReverseAString {

	public String reverseString(String inputString) {

		char[] crr = inputString.toCharArray();
		StringBuffer buffer = new StringBuffer();

		for (int i = crr.length - 1; i >= 0; i--) {
			buffer = buffer.append(crr[i]);
		}

		return buffer.toString();
	}

}
