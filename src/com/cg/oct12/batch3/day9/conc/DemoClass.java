package com.cg.oct12.batch3.day9.conc;

import java.util.concurrent.Callable;

class DemoClass implements Callable<Integer> {

	private int num;

	public DemoClass() {
		super();
		System.out.println("zero args constructor");
	}

	public DemoClass(int num) {
		super();
		System.out.println("parameterized constructor");
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		System.out.println("setNum");

		this.num = num;
	}

	@Override
	public Integer call() throws Exception {
		System.out.println("call");
		int localbariable = this.num;
		return localbariable;
	}

}
