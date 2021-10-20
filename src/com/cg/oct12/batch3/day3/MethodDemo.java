package com.cg.oct12.batch3.day3;

public class MethodDemo {

	// static - free access - with class reference
	static void hello() {
		System.out.println("Hello world!");
	}

	// non static - restricted access - with object reference
	void hi() {
		System.out.println("Hi!");
	}

	public static void main(String[] args) {

		System.out.println("Start");

		MethodDemo.hello();

		MethodDemo obj = new MethodDemo();

		obj.hi();

		System.out.println("End");

	}

}
