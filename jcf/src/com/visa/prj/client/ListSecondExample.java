package com.visa.prj.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSecondExample {

	public static void main(String[] args) {

		List<Integer> il=Arrays.asList(1,2,3,4,5);
		List<String> sl = Arrays.asList("one","two","three");
		
	
		print(il);
		print(sl);
		
		List<Integer> copyInt = new ArrayList<>();
		List<String> copyStr = new ArrayList<>();
		
		copy(copyInt,il);
		copy(copyStr,sl);
		System.out.println(copyInt);
		System.out.println(copyStr);
	
	}
	//PECS producer extends consumer super
	private static <T> void copy(List<? super T> copyInt, List<? extends T> il) {
		// TODO Auto-generated method stub
		for (T t : il) {
			copyInt.add(t);
		}
		
	}

	private static void print(List<?> list) {
		for (Object object : list) {
			System.out.println(object);
		}
	}

}
