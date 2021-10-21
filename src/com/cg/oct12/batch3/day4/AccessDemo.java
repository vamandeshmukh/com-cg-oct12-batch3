package com.cg.oct12.batch3.day4;

public class AccessDemo {

	public static int publicMember = 10;
	protected static int protectedMember = 20;
	static int packageMember = 30;
	private static int privateMember = 40;

	public static void main(String[] args) {

		System.out.println(AccessDemo.publicMember);
		System.out.println(AccessDemo.protectedMember);
		System.out.println(AccessDemo.packageMember);
		System.out.println(AccessDemo.privateMember);

	}

}
