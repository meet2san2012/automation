package com.tibco.automation.autoTestProj;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTestSuccessful {
	private static ICal calculator;

	@BeforeClass
	public static void initCalculator() {
		calculator = new Calculator();
	}

	@Before
	public void before()
	{
		System.out.println("**************Before***********");
	}
	
	@Test
	public void testadd() {
		int result = calculator.add(3, 4);

		assertEquals(7, result);
	}

	@Test
	public void testDiv() {
		try {
			int result = calculator.div(10, 2);

			assertEquals(5, result);
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}

	 @Test(expected = Exception.class)
	public void testDivisionException() throws Exception {
		calculator.div(10, 0);
	}

	@Test
	public void testSub() {
		int result = calculator.sub(10, 1);
		assertTrue(result == 9);
	}
}