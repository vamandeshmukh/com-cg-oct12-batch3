package com.cg.oct12.batch3.day8.equals;

public class Employee {

	int eid;
	String name;
	double salary;

	public Employee() {
		super();
	}

	public Employee(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eid;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			System.out.println("1");
			return true;
		}
		if (!(obj instanceof Employee)) {
			System.out.println("2");
			return false;
		}
		Employee other = (Employee) obj;
		if (eid != other.eid) {
			System.out.println("3");
			return false;
		}
		if (name == null) {
			System.out.println("4");

			if (other.name != null) {
				System.out.println("5");
				return false;
			}
		} else if (!name.equals(other.name)) {
			System.out.println("6");
			return false;
		}
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary)) {
			System.out.println("7");
			return false;
		}
		System.out.println("8");
		return true;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}
}
