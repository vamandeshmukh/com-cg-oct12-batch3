package com.cg.oct12.batch3;

public class App {

	public static void main(String[] args) {

//		primitive type - 8 
		int num = 10;
		char ch = 'a';
//		char name = 'Prashant';

		// reference type - Array String class (object) enum interface
		int[] marks = { 98, 95, 95, 96, 92 };

		char[] name = { 'P', 'r', 'a', 's', 'h', 'a', 'n', 't' };
		String name2 = "Prashant";

		// primitive datatypes
		// byte short int long char
		// float double
		// boolean
		// char

//		int i = 10;
//		char ch = 'a';
//		System.out.println(ch + i); // 107 

//		byte short int char  => int 
		byte b1 = 10, b2 = 20, b3 = (byte) (b1 + b2);

		System.out.println(b3);

	}

}
