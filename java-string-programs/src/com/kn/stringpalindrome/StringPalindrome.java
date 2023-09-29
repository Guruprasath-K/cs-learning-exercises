package com.kn.stringpalindrome;

public class StringPalindrome {

	public boolean isPalindrome(String inputString) {

		char[] crr = inputString.toCharArray();
		StringBuffer reverse = new StringBuffer();

		for (int i = crr.length - 1; i >= 0; i--) {
			reverse = reverse.append(crr[i]);
		}

		String result = reverse.toString();

		if (result.equals(inputString)) {
			return true;
		} else {
			return false;
		}
	}

}
