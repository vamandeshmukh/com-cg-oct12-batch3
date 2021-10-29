package com.cg.oct12.batch3.day10.revision;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		Map<Integer, Integer> map = new HashMap<>();
		map.put(10, 100);
		map.put(11, null);
		map.put(null, 150);
		System.out.println(map);
		map.put(15, 100);
		map.put(null, 125);
		System.out.println(map);

		ArrayList<String> a1 = new ArrayList<>();
		ArrayList<String> a2 = new ArrayList<>();

		Map<Integer, ArrayList<String>> map2 = new HashMap<>();
		map2.put(10, a1);
		map2.put(11, a2);

	}

}
