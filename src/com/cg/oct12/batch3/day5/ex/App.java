package com.cg.oct12.batch3.day5.ex;

import java.util.Scanner;

// exception handling 
// try catch finally throw throws 

// checked exception - is checked by JVM at compile time 
// SqlException 


// unchecked exception - is NOT checked by JVM at compile time 
// ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num1 = sc.nextInt();
		System.out.println("Enter another number to divide:");
		int num2 = sc.nextInt();
		try {
			System.out.println(num1 / num2);
		} 
		catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
			System.out.println("Do not try to divide by zero.");
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Do not try to divide by zero.");
		} 
		finally {
			System.out.println("End");
		}

	}
}
