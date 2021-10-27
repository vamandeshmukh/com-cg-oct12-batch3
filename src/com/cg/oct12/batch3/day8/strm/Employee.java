package com.cg.oct12.batch3.day8.strm;

public class Employee {

	int eid;
	String name;
	double salary;

	public Employee() {

	}

	public Employee(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}
}
