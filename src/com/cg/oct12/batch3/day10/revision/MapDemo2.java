package com.cg.oct12.batch3.day10.revision;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {

	public static void main(String[] args) {

		Map<String, String> stateCodes = new HashMap<>();

		stateCodes.put("MH", "Maharashtra");
		stateCodes.put("TS", "Telangana");
		stateCodes.put("GJ", "Gujrat");
		System.out.println(stateCodes);
		System.out.println(stateCodes.get("MH"));
		System.out.println(stateCodes.keySet());
		stateCodes.put("TS", "Some Other State");
		System.out.println(stateCodes);

	}
}
