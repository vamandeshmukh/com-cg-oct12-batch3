package com.cg.oct12.batch3.day5.mt;

public class MtDemo3 implements Runnable {

	public void myLoop() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	@Override
	public void run() {
		this.myLoop();
	}

	public static void main(String[] args) {

		Thread obj = new Thread(new MtDemo3());
		obj.start();
		try {
			obj.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Thread obj2 = new Thread(new MtDemo3());
		obj2.start();
		Thread obj3 = new Thread(new MtDemo3());
		obj3.start();

	}
}
