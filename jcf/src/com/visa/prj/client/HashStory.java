package com.visa.prj.client;

public class HashStory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println(s1==s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		String s3 = new String("Aa");
		String s4 = new String("BB");
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());

	}

}
