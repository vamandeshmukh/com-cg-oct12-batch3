package com.cg.oct12.batch3;

public class ForEachDemo {

	public static void main(String[] args) {

		int[] num = { 98, 96, 94, 97, 99 };

//		System.out.println(num[2]);

//		for (int i = 0; i < 5; i++) {
//			System.out.println(num[i]);
//		}

		for (int n : num) {
			System.out.println(n);
		}
	}
	
	
}
