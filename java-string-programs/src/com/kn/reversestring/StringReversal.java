package com.kn.reversestring;

public class StringReversal {

	public String stringreverse(String inputString) {

		char[] crr = inputString.toCharArray();
		StringBuffer reverse = new StringBuffer();

		for (int i = crr.length - 1; i >= 0; i--) {
			reverse = reverse.append(crr[i]);
		}

		return reverse.toString();

	}

}
