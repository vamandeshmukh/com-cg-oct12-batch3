package com.cg.oct12.batch3.day5.mt;

public class MtDemo extends Thread {

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

		MtDemo obj = new MtDemo();
//		obj.myLoop();
		obj.start();
		MtDemo obj2 = new MtDemo();
//		obj2.myLoop();
		obj2.start();

	}

}
