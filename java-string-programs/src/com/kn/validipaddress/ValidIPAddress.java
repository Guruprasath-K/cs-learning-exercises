package com.kn.validipaddress;

public class ValidIPAddress {

	public boolean isvalidIPAddress(String inputString) {

		String[] srr = inputString.split(".");
		boolean isValid = false;

		if (srr.length == 4) {
			for (int i = 0; i < srr.length; i++) {
				char[] crr = srr[i].toCharArray();

			}
		}
		return isValid;
	}

}
