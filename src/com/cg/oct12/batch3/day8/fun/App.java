package com.cg.oct12.batch3.day8.fun;

////2. abstract method usage - by anonymous inner class 
public class App {

	public static void main(String[] args) {

		FunIn obj = new FunIn() {
			@Override
			public void anotherAbstractMethod() {
				System.out.println("anotherAbstractMethod");
			}

			@Override
			public void abstractMethod() {
				System.out.println("abstractMethod");
			}
		};

		obj.abstractMethod();
		obj.anotherAbstractMethod();

	}

// // this is possible 
//	class SomeClass {
//	}
//	static class SomeStaticClass {
//	}
}

//// 1. abstract method usage - by implementing the interface 
//public class App implements FunIn {
//
//	public static void main(String[] args) {
//
//		FunIn.staticMethod();
//
//		App obj = new App();
//		obj.abstractMethod(); // this example 
//		obj.defaultMethod();
//		obj.anotherDefaultMethod();
//
//	}
//
//	@Override
//	public void abstractMethod() { // this exaample 
//		System.out.println("abstractMethod");
//	}
//}
