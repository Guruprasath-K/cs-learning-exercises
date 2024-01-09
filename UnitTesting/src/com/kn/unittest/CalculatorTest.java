package com.kn.unittest;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

	public void testAdd() {
	Calculator calculator = new Calculator();

		int result = calculator.add(2, 3);

		assertEquals(5, result);
	}
}
