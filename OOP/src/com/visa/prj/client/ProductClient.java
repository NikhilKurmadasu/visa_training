package com.visa.prj.client;

import java.lang.reflect.Method;

import com.visa.prj.entity.Mobile;
import com.visa.prj.entity.Product;
import com.visa.prj.entity.Tv;

public class ProductClient {
	public static void main(String[] args) {
		Product[] products = new Product[4]; // array of 4 pointers of type product
		products[0] = new Tv(133, "Sony Bravia", 135000.00, "LED");
		products[1] = new Mobile(453, "MotoG", 12999.00, "4G");
		products[2] = new Tv(634, "Onida Thnder", 35000.00, "CRT");
		products[3] = new Mobile(621, "iphone xr", 99999.00, "4G");

		//printExpensive(products);
		//printInfo(products);
		printInfoOCP(products);
	}

	/*
	 *Print details using open for extension, closed for change
	 * Done using Reflection API's
	 * @param products
	 */
	private static void printInfoOCP(Product[] products) {
		
		for (Product product : products) {
			Class clazz=product.getClass();
			Method[] methods = clazz.getMethods();
			for (Method method : methods) {
				if(method.getName().startsWith("get")) {
					try {
						Object ret = method.invoke(product);
						System.out.println(ret);
						
					} catch(Exception ex) {
					ex.printStackTrace();
					}
				}
			}
		}
	}

	private static void printInfo(Product[] products) {
		
		for (Product product : products) {
			if (product.isExpensive())
				System.out.println(product.getName() + " : " + product.getPrice() + " : ");
			if(product instanceof Tv) {
			Tv t = (Tv) product;
			System.out.println(t.getScreentype());
			}
			if(product.getClass()==Mobile.class) {
				Mobile m=(Mobile) product;
				System.out.println(m.getConnectivity());
			}
			System.out.println("******");
		}
	}

	private static void printExpensive(Product[] products) {
		for (Product product : products) {
			if (product.isExpensive())
				System.out.println(product.getName() + " is expensive dude");
		}

	}
}
