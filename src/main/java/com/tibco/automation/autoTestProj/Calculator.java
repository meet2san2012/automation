package com.tibco.automation.autoTestProj;


public class Calculator implements ICal
{

	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int mul(int a, int b) {
		return a * b;
	}

	public int div(int a, int b) throws Exception {
		if (b == 0) {
			throw new Exception("Divider can't be zero");
		}
		return a / b;
	}
}