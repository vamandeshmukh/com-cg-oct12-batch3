package com.cg.oct12.batch3.day10.revision;

//import java.util.ArrayList;
//import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class ConCol implements Runnable {

//	public List<Integer> list = new ArrayList<>();
	CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

	@Override
	public void run() {
		System.out.println("run");
		for (int i = 31; i <= 40; i++) {
			this.list.add(i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ConcColDemo {

	public static void main(String[] args) {

		System.out.println("Start");
		ConCol con = new ConCol();
		Thread thread = new Thread(con);
		thread.start();
		for (int i = 1; i <= 10; i++) {
			con.list.add(i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(con.list);
		System.out.println(con.list.size());
		System.out.println("End");
	}
}