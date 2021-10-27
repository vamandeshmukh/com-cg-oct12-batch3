package com.cg.oct12.batch3.day8.fun;

// interface can contain - 0 or more - abstract, static and default methods 

// functional interface - it contains only one abstract method. 
// it may contain 0 or more default and static methods. 

@FunctionalInterface
public interface FunIn {

	public abstract void functionalMethod();

//	 public abstract void abstractMethod();

//	public abstract void anotherAbstractMethod();

//	public default void defaultMethod() {
//		System.out.println("defaultMethod");
//	}
//
//	public default void anotherDefaultMethod() {
//		System.out.println("anotherDefaultMethod");
//	}
//
//	public static void staticMethod() {
//		System.out.println("staticMethod");
//	}
//
//	public static void anotherStaticMethod() {
//		System.out.println("anotherStaticMethod");
//	}
}
