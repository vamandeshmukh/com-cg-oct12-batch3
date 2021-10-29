package com.cg.oct12.batch3.day10.revision;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack<Integer> stack1 = new Stack<>();

		stack1.add(10);
		stack1.add(12);
		stack1.add(15);
		System.out.println(stack1);
		System.out.println(stack1.size());
		System.out.println(stack1.capacity());

	}

}
