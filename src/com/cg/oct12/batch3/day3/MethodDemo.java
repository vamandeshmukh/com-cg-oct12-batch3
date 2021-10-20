package com.cg.oct12.batch3.day3;

public class MethodDemo {

	static void hello() {
		System.out.println("Hello world!");
	}

	void hi() {
		System.out.println("Hi!");
	}

	public static void main(String[] args) {

		System.out.println("Start");
		hello();

		MethodDemo obj = new MethodDemo();

		obj.hi();
		System.out.println("End");

	}

}
