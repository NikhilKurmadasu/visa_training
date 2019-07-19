package com.visa.prj.client;

import java.util.Arrays;

public class ArrayClient {
	public static void main(String[] args) {
		String[] names = {"Calvin","George","Lee","Angelina","Brad"};
		//Arrays.sort(names);
		Arrays.sort(names,(o1,o2) -> o1.length()-o2.length());
		for (String string : names) {
			System.out.println(string);
		}
	}
}
