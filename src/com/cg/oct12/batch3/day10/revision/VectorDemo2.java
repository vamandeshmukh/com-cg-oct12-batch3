package com.cg.oct12.batch3.day10.revision;

import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) {

		Vector<Integer> v3 = new Vector<>(); // 10, (10*2)
		Vector<Integer> v2 = new Vector<>(4); // 4, (10*2)
		Vector<Integer> v1 = new Vector<>(4, 3); // 4, 3

		v1.add(10);
		v1.add(20);
		v1.add(30);
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		v1.add(20);
		v1.add(30);
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());

	}

}
