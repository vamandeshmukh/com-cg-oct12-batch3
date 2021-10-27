package com.cg.oct12.batch3.day8.equals;

public class App {

	public static void main(String[] args) {

		Employee emp = new Employee(101, "Sonu", 10.5);
		Employee emp2 = new Employee(102, "Monu", 10.6);
		Employee emp3 = new Employee(101, "Sonu", 10.5);

		System.out.println(emp == emp2);
		
		System.out.println(emp.equals(emp));
		System.out.println(emp.equals(emp2));
		System.out.println(emp.equals(emp3));

	}

}
