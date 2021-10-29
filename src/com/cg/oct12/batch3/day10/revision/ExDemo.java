package com.cg.oct12.batch3.day10.revision;

public class ExDemo {

	int addNum() {
		// code
		int i = 10;
		if (i < 10) { // unacceptable situation
			throw new ArithmeticException("Something is not right.");
		}
		return 0;
	}

	void someMethod() throws RuntimeException {
		// code
		// this code may arise an exception here
	}

	public static void main(String[] args) {

		System.out.println("Start");
//		int i = 5;
		System.out.println("End");

	}
}
