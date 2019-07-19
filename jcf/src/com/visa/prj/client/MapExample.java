package com.visa.prj.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Double> map = new HashMap<>();
		map.put("Java",534.44);
		map.put("Oracle", 633.33);
		map.put("JS",53.44);
		map.put("Java",5555.33);
		
		System.out.println(map.get("Java"));
		
		Set<String> keys=map.keySet();
		for (String string : keys) {
			System.out.println(string + ":" + map.get(string));
		}
		
		keys.forEach(System.out::println);
		
		map.forEach((k,v)-> System.out.println(k+":"+v));

	}

}
