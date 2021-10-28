package com.cg.oct12.batch3.day9.conc;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableWithArguments {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		System.out.println("Start");
		DemoClass demoClass = new DemoClass(); // constructor injection
//		demoClass.setNum(15); // setter injection
		ExecutorService ex = Executors.newSingleThreadExecutor();
		Future<Integer> f = ex.submit(demoClass);
		Integer result = f.get();
		System.out.println(result);
		ex.shutdown();
		System.out.println("End");
	}
}
