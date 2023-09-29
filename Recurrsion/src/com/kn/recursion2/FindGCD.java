package com.kn.recursion2;

public class FindGCD {

	public int findGCD(int input1, int input2) {
		if (input2 != 0) {
			return findGCD(input2, input1 % input2);
		} else {
			return input1;
		}

	}

}
