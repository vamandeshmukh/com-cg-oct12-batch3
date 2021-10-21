package com.cg.oct12.batch3.day4;

public class LabDemo {

	int num = 1;

	void fun(int i) {
		System.out.println(num++);
		if (num <= i)
			fun(i);
	}

	public static void main(String[] args) {
		System.out.println("Start");
		LabDemo obj = new LabDemo();
		obj.fun(10);

	}

}
