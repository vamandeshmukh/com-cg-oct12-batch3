package com.cg.oct12.batch3.day3;

public class Methods {

	static void m1() {
		System.out.println("m1");
	}

	static int num() {
		return 10;
	}

	static double pi() {
		return 3.142;
	}

//	static Methods getObject() {
//		return new Methods();
//	}

	public static void main(String[] args) {
		System.out.println("main");

		Methods.m1();
//		int i = Methods.m1(); // CE 

		int output = Methods.num();
		System.out.println(output);
		System.out.println(Methods.num());

	}

}
