package com.cg.oct12.batch3.day9.conc;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableWithArguments {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		System.out.println("Start");
		DemoClass demoClass = new DemoClass(10);
		demoClass.setNum(15);
		ExecutorService ex = Executors.newSingleThreadExecutor();
		Future<Integer> f = ex.submit(demoClass); // constructor injection
		Integer result = f.get();// setter injection
		System.out.println(result);
		ex.shutdown();
		System.out.println("End");
	}
}
