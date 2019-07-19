package com.visa.prj.client;

import java.lang.ref.SoftReference;

public class ReferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoftReference<String> wr = new SoftReference<String>(new String("Hello"));
		System.out.println(wr.get());
		System.gc();

		try {
			Thread.sleep(10000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(wr.get());
	}

}
