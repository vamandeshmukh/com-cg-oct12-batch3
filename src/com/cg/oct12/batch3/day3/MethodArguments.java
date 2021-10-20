package com.cg.oct12.batch3.day3;

public class MethodArguments {

	static int addTwoNumbers(int i, int j) {
		return i + j;
	}

	static void addTwoAndPrint(int i, int j) {
		System.out.println(i + j);
	}

	public static void main(String[] args) {

		int output = MethodArguments.addTwoNumbers(10, 20);

		System.out.println(output);
		System.out.println(MethodArguments.addTwoNumbers(20, 30));
		MethodArguments.addTwoAndPrint(10, 20);
	}
}
