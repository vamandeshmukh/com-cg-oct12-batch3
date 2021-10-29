package com.cg.oct12.batch3.day10.revision;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();
		set.add(20);
		set.add(15);
		set.add(10);
		set.add(25);
		System.out.println(set);
		set.add(10);
		System.out.println(set);

		Set<Integer> set2 = new LinkedHashSet<>();
		set2.add(20);
		set2.add(15);
		set2.add(10);
		set2.add(25);
		System.out.println(set2);
		set2.add(10);
		System.out.println(set2);

	}

}
