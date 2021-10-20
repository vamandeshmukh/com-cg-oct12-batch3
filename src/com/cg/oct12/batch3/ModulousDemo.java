package com.cg.oct12.batch3;

public class ModulousDemo {

	public static void main(String[] args) {

		// + - * /

		int a = 10, b = 3, c = a % b;
		System.out.println(c);

		int numberOfTrainees = 100;
		int numberOfbatches = 3;
		int numberOfRemainingTrainees = numberOfTrainees % numberOfbatches;
		System.out.println(numberOfRemainingTrainees);

	}

}
