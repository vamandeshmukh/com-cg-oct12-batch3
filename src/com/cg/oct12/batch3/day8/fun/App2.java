package com.cg.oct12.batch3.day8.fun;

public class App2 {

	static int num = 25;

//	
//	void someMethod() {
//		
//	}

	public static void main(String[] args) {

//		FunIn2 obj = (int i, int j) -> {
//			System.out.println("saa");
//			return i + j;
//		};

		FunIn2 obj = (int i, int j) -> i + j;

		int output = obj.addNums(10, 20);
		System.out.println(output);

		FunIn3 obj3 = () -> num;

		System.out.println(obj3.getNum());

	}

}
