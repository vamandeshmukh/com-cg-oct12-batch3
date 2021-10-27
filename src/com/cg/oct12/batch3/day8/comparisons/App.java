package com.cg.oct12.batch3.day8.comparisons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class App {

	public static void main(String[] args) {

//		Comparable<T>

//		Comparator<T>

//		InterfaceName obj = new ClassName();

		List<Employee> empList = new ArrayList<>();

		// ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(101, "Sonu", 10.6));
		empList.add(new Employee(102, "Monu", 20.6));
		empList.add(new Employee(103, "Tonu", 40.6));
		empList.add(new Employee(104, "Ponu", 30.6));
		System.out.println(empList);

//		Collections.sort(empList);

		System.out.println(empList);

//		List<Integer> list = new ArrayList<>();
//		System.out.println(list);
//		list = new LinkedList<>();
//		list = new Stack<>();
//
//		ArrayList<Integer> list2 = new ArrayList<>();
//		System.out.println(list2);
////		list2 = new LinkedList<>();

	}

}
