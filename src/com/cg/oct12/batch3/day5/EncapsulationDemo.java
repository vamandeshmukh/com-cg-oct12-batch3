package com.cg.oct12.batch3.day5;

public class EncapsulationDemo {

	public static void main(String[] args) {

		Employee emp = new Employee();
		System.out.println(emp.getSalary());
//		emp.salary = 10000;
		emp.setSalary(10000);
		System.out.println(emp.getSalary());

	}

}
