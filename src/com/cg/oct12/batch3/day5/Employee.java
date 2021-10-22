package com.cg.oct12.batch3.day5;

// Encapsulation - 
// bind data members with methods 
// to secure data 
// make fields as private 
// make public methods to access those fields 

public class Employee {

	private int eid;
	private String firstName;
	private double salary = 8000; // read-only + writable field

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
