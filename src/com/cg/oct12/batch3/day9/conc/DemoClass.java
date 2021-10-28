package com.cg.oct12.batch3.day9.conc;

import java.util.concurrent.Callable;

class DemoClass implements Callable<Integer> {

	private int num;

	public DemoClass() {
		super();
	}

	public DemoClass(int num) {
		super();
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public Integer call() throws Exception {
		int localbariable = this.num;
		return localbariable;
	}

}
