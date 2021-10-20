package com.cg.oct12.batch3.day3;

public class FieldsDemo {

	// static field
	static int num1;
	// non static field
	int num2;

	public static void main(String[] args) {

		// local variable
		int num3;
		num3 = 1;
		System.out.println(num3);

		System.out.println(FieldsDemo.num1);

		FieldsDemo obj = new FieldsDemo();
		System.out.println(obj.num2);

	}

}
