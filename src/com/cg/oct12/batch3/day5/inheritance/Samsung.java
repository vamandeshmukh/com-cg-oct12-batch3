package com.cg.oct12.batch3.day5.inheritance;

public class Samsung extends SmartPhone {
	
	public static void main(String[] args) {
		Samsung obj1 = new Samsung();
		obj1.call();
		obj1.sms();
		obj1.music();
		obj1.camera();
	}
}
