package com.visa.prj.client;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Double> map = new WeakHashMap<>();
		String s=new String("Java");
		map.put(s, 5555.22);
		
		s=null;
		
		System.gc();

		try {
			Thread.sleep(10000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(map.get("Java"));
	}

}
