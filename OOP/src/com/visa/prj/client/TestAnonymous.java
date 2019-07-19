package com.visa.prj.client;

@FunctionalInterface
interface Computation{
	int compute(int x,int y);
	}


public class TestAnonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computation c1=new Computation() {
			
			@Override
			public int compute(int x, int y) {
				// TODO Auto-generated method stub
				return x+y;
			}
		};
		System.out.println(c1.compute(34,46));
		
		/*
		 * Java 8 introduced Lambda Expression
		 * as a shorter form for anonymous class
		 * 
		 * Limitations : Interface should have only one method to implement
		 */
		Computation c2=(int x, int y)->{
			return x-y;
		};
		System.out.println(c2.compute(34,46));
		
		Computation c3=(x,y)->x*y;
		System.out.println(c3.compute(34,46));
	}

}
