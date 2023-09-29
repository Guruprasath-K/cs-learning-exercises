package com.kn.ceasercipher;

public class CeaserCipher {

	public String convertCeaserCipher(String inputString, int encryption) {

		char[] crr = inputString.toCharArray();

		for (int i = 0; i < crr.length; i++) {
			if (crr[i] >= 65 && crr[i] <= 90) {
				if (crr[i] + encryption <= 90) {
					crr[i] = (char) (crr[i] + encryption);
				} else {
					crr[i] = (char) (crr[i] - 26 + encryption);
				}
			} else if (crr[i] >= 97 && crr[i] <= 122) {
				if (crr[i] + encryption <= 122) {
					crr[i] = (char) (crr[i] + encryption);
				} else {
					crr[i] = (char) (crr[i] - 26 + encryption);
				}
			} else if (crr[i] >= 48 && crr[i] <= 57) {
				if (crr[i] + encryption <= 57) {
					crr[i] = (char) (crr[i] + encryption);
				} else {
					crr[i] = (char) (crr[i] - 10 + encryption);
				}
			}
		}
		String outputString = new String(crr);

		return outputString;

		// return sb1.toString();
	}

}
