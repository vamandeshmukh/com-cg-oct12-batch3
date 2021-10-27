package com.cg.oct12.batch3.day8.comparisons;

public class Employee {

	int eid;
	String eName;
	double salary;

	public Employee() {
		super();
	}

	public Employee(int eid, String eName, double salary) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", eName=" + eName + ", salary=" + salary + "]";
	}

}
