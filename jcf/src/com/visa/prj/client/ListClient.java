package com.visa.prj.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

import com.visa.prj.entity.Product;

public class ListClient {

	public static void main(String[] args) {

		List<Product> products = new ArrayList<>();
		products.add(new Product(645,"Hp Laptop",135000.00,"computer",100));
		products.add(new Product(224,"iPhone",98000.00,"mobile",500));
		products.add(new Product(834,"Logitech Mouse",600.00,"computer",300));
		products.add(new Product(5,"Sony Bravia",125000.00,"tv",900));
		products.add(new Product(912,"One Plus",32000.00,"mobile",100));
		products.add(new Product(88,"HP Printer",19000.00,"computer",100));
		System.out.println("*************88");
		
		
		Map<String,List<Product>> map = products.stream().
				collect(Collectors.groupingBy(p->p.getCategory()));
		
		map.forEach((k,v)->{
		System.out.println(k);
		v.forEach(System.out::println);
		});
		
		List<Product> list = new CopyOnWriteArrayList<>(products);
		Collections.sort(products);
		Collections.sort(list);
		Iterator<Product> iter = list.iterator();
		System.out.println("*************88");
		while(iter.hasNext())
		{
			products.add(new Product());
			System.out.println(iter.next());
			
		}
		
		
//		for ( Product product : products) {
//				System.out.println(product);
//		}
		
		Collections.sort(products, (p1,p2) -> Double.compare(p1.getPrice() ,p2.getPrice()) );
		//System.out.println(products);
		/*
		 * Traverse
		 * Avoid for loop and use for each loop for concurrent operations to b voided
		 */
		
		System.out.println("******");
		Iterator<Product> iterator = products.iterator();
		//Iterator<Product> iterator1 = products.iterator();

		//products.add(new Product());//concurrent Modification Exception
		
		while(iterator.hasNext())
		{
			Product p = iterator.next();
			System.out.println(p);
		}
		//products.add(new Product());
		System.out.println("******");
		for (Product product : products) {
	//		products.add(new Product());
			System.out.println(product);
		}
		
		
	}

}
