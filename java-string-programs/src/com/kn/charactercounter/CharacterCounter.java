package com.kn.charactercounter;

public class CharacterCounter {

	public void characterCount(String inputString) {

		char[] crr = inputString.toCharArray();
		crr = sortCharacterArray(crr);
		System.out.println("After sorting");
		for (char c : crr) {
			System.out.print(c);
		}
		System.out.println();
		int count = 1;
		for (int i = 0; i < crr.length - 1; i++) {
			if (crr[i] == crr[i + 1]) {
				count++;
		} else {
			System.out.println(crr[i] + " occured " + count + " times");
			count = 1;
			}
			if (i + 1 == crr.length - 1) {
				System.out.println(crr[i + 1] + " occured " + count + " times");
			}
		}
	}

	private char[] sortCharacterArray(char[] crr) {
		for (int i = 0; i < crr.length - 1; i++) {
			for (int j = 0; j < crr.length - 1 - i; j++) {
				if (crr[j] > crr[j + 1]) {
					char temp = crr[j];
					crr[j] = crr[j + 1];
					crr[j + 1] = temp;
				}
			}
		}

		return crr;
	}

}
