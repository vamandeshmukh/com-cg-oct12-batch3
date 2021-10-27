package com.cg.oct12.batch3.day8.strm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {

		// create a List of employees
		List<Employee> empList = new ArrayList<>();

		// create employees' data to process
		empList.add(new Employee(101, "Vaman", 10000));
		empList.add(new Employee(102, "Raman", 18000));
		empList.add(new Employee(103, "Soman", 12000));
		empList.add(new Employee(104, "Suman", 15000));
		empList.add(new Employee(105, "Lakshman", 20000));

		// print the list
		System.out.println(empList);

		Iterator<Employee> it = empList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
