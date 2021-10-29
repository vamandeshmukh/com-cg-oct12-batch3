package com.cg.oct12.batch3.day10.revision;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<Integer> list1 = new LinkedList<>(); // doubly linked list

		list1.add(10);
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(null);
		System.out.println(list1);
		System.out.println(list1.size());
//		System.out.println(list1.capacity());
//		System.out.println(list1.get(list1.lastIndexOf(20)));
		System.out.println(list1.getFirst());

//		List<Integer> list2 = new ArrayList<>(); // dynamic array

	}

}
