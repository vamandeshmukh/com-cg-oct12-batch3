package com.cg.oct12.batch3.day9.conc;

//class ClassOne extends Thread {
class ClassOne implements Runnable {

	int m1() {
		System.out.println("m1");
		return 10;
	}

	void m2() {
		System.out.println("m2");
	}

	@Override
	public void run() {
		System.out.println("run" + Thread.currentThread().getName());
		this.m1();
	}
}

public class App {

	public static void main(String[] args) {
		System.out.println("main");
		for (int i = 0; i < 10; i++) {
			Thread obj = new Thread(new ClassOne());
			obj.start(); //
		}
		System.out.println("end");
	}

}
