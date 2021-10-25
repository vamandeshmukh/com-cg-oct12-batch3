package com.cg.oct12.batch3.day7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {

	public static void main(String[] args) {

//		String regex = "[a-zA-Z0-9#@\\h]{5}", input = "a_  @"; // abc xyz ijk // ABC 123
//		String regex = "[\\d]{3}", input = "457"; // [0-9]{3}
		String regex = "[\\D]{3}", input = "awE"; // [non digit characters]{3}
//		String regex = "[\\w]{3}", input = "4Ya"; // [a-zA-Z0-9]{3}
//		String regex = "[\\w]{3}", input = "%Ya"; // abc xyz ijk // ABC 123

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(input);

		System.out.println(matcher.matches());
		System.out.println(matcher.lookingAt());
//		System.out.println(matcher.find());

	}

}
