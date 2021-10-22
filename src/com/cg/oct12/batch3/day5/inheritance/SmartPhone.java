package com.cg.oct12.batch3.day5.inheritance;

public class SmartPhone extends FeaturePhone { // multilevel inheritance
	void camera() {
		System.out.println("Snap a pic");
	}

	@Override
	void music() {
		System.out.println("Play music with Dolby");
	}
}
