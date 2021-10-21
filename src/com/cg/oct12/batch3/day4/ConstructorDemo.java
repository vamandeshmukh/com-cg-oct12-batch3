package com.cg.oct12.batch3.day4;

/*
 * constructor - 
 * name is same as class name 
 * it is a special type of method 
 * it does not have a return type 
 * it is used to create and initialize an object of the class 
 * by default JVM provides a zero-args constructor 
 * we also can define constructors 
 * but if we define a constructor, JVM will not provide any constructor
 * a class can have one or more constructors  
 * 
 */

class Employee {

	int eid;
	String name;
	double salary;

	Employee() {
		System.out.println("Employee constructor");
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.eid = 101;
		emp.name = "Jeevan";
		emp.salary = 10.5;
		System.out.println(emp.eid + " " + emp.name + " " + emp.salary);

		Employee emp2 = new Employee();
		emp2.eid = 102;
		emp2.name = "Ajeet";
		emp2.salary = 10.6;
		System.out.println(emp2.eid + " " + emp2.name + " " + emp2.salary);
	}
}
