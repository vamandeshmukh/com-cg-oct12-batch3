package com.cg.oct12.batch3.day8.comparisons;

public class Employee2 implements Comparable<Employee2> {

	int eid;
	String eName;
	double salary;

	public Employee2() {
		super();
	}

	public Employee2(int eid, String eName, double salary) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee2 [eid=" + eid + ", eName=" + eName + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee2 o) {
		if (salary == o.salary)
			return 0;
		else if (salary > o.salary)
			return 1;
		else
			return -1;
	}
}
