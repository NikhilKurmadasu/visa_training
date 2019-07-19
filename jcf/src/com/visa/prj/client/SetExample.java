package com.visa.prj.client;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.visa.prj.entity.Product;

public class SetExample {

	public static void main(String[] args) {
		
		String str = "we are the world we are the chidren";
		String strDup = "we are the world we are the chidren";
		
		String[] arr=strDup.split(" ",0);
		for (String string : arr) {
			System.out.println(string);
		}
		List<String> u =new ArrayList();
		System.out.println(arr);
		String[] arr1=arr;
		
		Set<String> UniqueSet=new TreeSet<>(); 
		for(String s : arr1) {
		boolean Unique=UniqueSet.add(s);
		
		}
		System.out.println(UniqueSet);
		System.out.println("******************");
		
		Set<Product> products = new TreeSet<>((p1,p2)->{
			int diff = Double.compare(p1.getPrice(), p2.getPrice());
			if(diff == 0)
			{
				diff=p1.getId()-p2.getId();
			}
			return diff;
		});
		//Set<Product> products = new HashSet<>();
		products.add(new Product(645, "Hp Laptop", 135000.00, "computer", 100));
		products.add(new Product(224, "iPhone", 98000.00, "mobile", 500));
		products.add(new Product(834, "Logitech Mouse", 600.00, "computer", 300));
		products.add(new Product(5, "Sony Bravia", 125000.00, "tv", 900));
		products.add(new Product(912, "One Plus", 32000.00, "mobile", 100));
		products.add(new Product(88, "HP Printer", 19000.00, "computer", 100));
		products.add(new Product(5, "Sony Bravia", 125000.00, "tv", 900));

		for (Product product : products) {
			System.out.println(product);
		}

	}

}
