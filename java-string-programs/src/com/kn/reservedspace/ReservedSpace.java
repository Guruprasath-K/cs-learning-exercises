package com.kn.reservedspace;

public class ReservedSpace {

	public String reserveString(String inputString) {

		char[] crr = inputString.toCharArray();
		char[] rrr = new char[crr.length];
		for (int i = 0; i < crr.length; i++) {
			if (crr[i] == ' ') {
				rrr[i] = ' ';
			}
		}

		int j = rrr.length - 1;
		for (int i = 0; i < crr.length; i++) {
				if (crr[i] != ' ') {
				while (j >= 0 && rrr[j] == ' ') {
				j--;
				}
				rrr[j--] = crr[i];
			}
		}
		String outputString = new String(rrr);
		return outputString;
	}

}
