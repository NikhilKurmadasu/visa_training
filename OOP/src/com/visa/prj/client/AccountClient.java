package com.visa.prj.client;

import com.visa.prj.entity.Account;

public class AccountClient {

	public static void main(String[] args) {
		Account first = new Account("s1");
		Account second = new Account("s2");
		
		first.deposit(5000); //deposit(first,5000)
		second.deposit(25000); //deposit(second,10000)
		
		
		System.out.println("first account");
		System.out.println("balance : "+ first.getBalance());
		
		System.out.println("second account");
		System.out.println("balance : "+ second.getBalance());
		
		System.out.println("************************");
		
		Account rahul=new Account("SBI100)");
		Account swetha=new Account("SBI100)");
		
		Account ref=rahul;
		
		if(ref==rahul) {
			System.out.println("ref and rahul points to same location");
		}
		
		if(rahul.equals(swetha)) {
			System.out.println("Same content!!");
		}
		
		System.out.println(Account.getCount());
	}
}
