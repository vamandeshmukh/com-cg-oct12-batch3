package com.cg.oct12.batch3.day8.equals;

public class App {

	public static void main(String[] args) {

		Employee emp = new Employee(101, "Sonu", 10.5);
		Employee emp2 = new Employee(102, "Monu", 10.6);
		Employee emp3 = new Employee(103, "Tonu", 10.2);

		System.out.println(emp.equals(emp2));
		System.out.println(emp.equals(emp3));

		System.out.println(emp.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());

	}

}
