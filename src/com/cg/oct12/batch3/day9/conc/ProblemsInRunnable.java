package com.cg.oct12.batch3.day9.conc;

public class ProblemsInRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("run " + Thread.currentThread().getName() + " " + i);
		}
	}

	public static void main(String[] args) {

		// need to create multiple threads manually

		for (int i = 1; i <= 10; i++) {
			Thread thread = new Thread(new ProblemsInRunnable());
			thread.start();
		}
	}
}
