package com.kn.anagramstrings;

public class AnagramStrings {

	public boolean isAnagramString(String inputString1, String inputString2) {

		boolean isAnagram = false;
		if (inputString1.length() == inputString2.length()) {
			char[] crr1 = inputString1.toCharArray();
			char[] crr2 = inputString2.toCharArray();

			crr1 = sortCharacterArray(crr1);
			crr2 = sortCharacterArray(crr2);

			for (int i = 0; i < crr1.length; i++) {
				if (crr1[i] != crr2[i]) {
					isAnagram = false;
				}
			}
			isAnagram = true;
		}
		return isAnagram;
	}

	public char[] sortCharacterArray(char[] crr) {

		for (int i = 0; i < crr.length - 1; i++) {
			for (int j = 0; j < crr.length - 1 - i; j++) {
				if (crr[j] > crr[j + 1]) {
					char temp1 = crr[j];
					crr[j] = crr[j + 1];
					crr[j + 1] = temp1;
				}
			}
		}
		return crr;
	}
}
