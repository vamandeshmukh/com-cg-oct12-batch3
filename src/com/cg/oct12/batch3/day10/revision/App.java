package com.cg.oct12.batch3.day10.revision;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		// List Set Map Queue 

		System.out.println("Start");

		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(10);
		list1.add(20);
		list1.add(null);
		list1.add(30);
		System.out.println(list1);
//		list1.add(10.5);

		List<Integer> list2 = new ArrayList<>();
		list2.add(50);
		list2.add(60);
		list2.add(70);
		System.out.println(list2);
//		list1.add(list2);
		list1.addAll(list2);

		System.out.println(list1);

		System.out.println("End");

	}

}
