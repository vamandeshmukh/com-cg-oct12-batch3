package com.cg.oct12.batch3.day5.abc;

//interface 
//mainly contain abstract methods 
//from java 8, also contain static and default methods 
//allow multiple inheritance in java 
// object can not be created 

interface In1 {

	public abstract void m1();

	public static void m2() {
		System.out.println("m2");
	}

	public default void m3() {
		System.out.println("m3");
	}

}

class Class2 implements In1 {

	@Override
	public void m1() {
		System.out.println("m1");
	}

}

public class IntDemo {

	public static void main(String[] args) {

		Class2 class2 = new Class2();
		class2.m1();
		class2.m3();
		In1.m2();

	}

}

class Employee {

	private int eid;
	private String firstName;
	private double salary = 8000; // read-only + writable field

}


