package com.cg.oct12.batch3.day4;

public class WrapperDemo {

	public static void main(String[] args) {

		int num = 10;

		Integer num2 = 20;

		String s1 = "10", s2 = "20";

		int i = Integer.parseInt(s1), j = Integer.parseInt(s2), k = i + j;

		String s3 = Integer.toString(k);

		System.out.println(s3);

	}

}
