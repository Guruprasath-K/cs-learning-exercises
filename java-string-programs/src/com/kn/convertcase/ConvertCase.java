package com.kn.convertcase;

public class ConvertCase {

	public String convertCase(String inputString) {
		String[] srr = inputString.split(" ");
		StringBuffer sb = new StringBuffer();

		for (String s : srr) {
			char[] crr = s.toCharArray();
			for (int i = 0; i < crr.length; i++) {
				if (crr[i] >= 97 && crr[i] <= 122) {
					crr[i] = (char) (crr[i] - 32);
				} else if (crr[i] >= 65 && crr[i] <= 90) {
					crr[i] = (char) (crr[i] + 32);
			}
				sb.append(crr[i]);
			}
			sb.append(" ");
		}

		String result = sb.toString();
		return result.trim();

	}

}
