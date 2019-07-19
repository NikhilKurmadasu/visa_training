package com.visa.prj.client;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import com.visa.prj.entity.Product;

public class MapObjectsExampe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = new Product(645,"Hp Laptop",135000.00,"computer",100);
//		products.add(new Product(224,"iPhone",98000.00,"mobile",500));
//		products.add(new Product(834,"Logitech Mouse",600.00,"computer",300));
//		products.add(new Product(5,"Sony Bravia",125000.00,"tv",900));
//		products.add(new Product(912,"One Plus",32000.00,"mobile",100));
//		products.add(new Product(88,"HP Printer",19000.00,"computer",100));
		System.out.println("*************");
		Map<String,Object> info = storeInfo(product);
		System.out.println(info);
		
		Map<String,Integer> map = getWordFrequency("I am I am King");
		System.out.println(map);
	}

	private static Map<String,Integer> getWordFrequency(String string){
		Map<String,Integer> map=new HashMap<String,Integer>();
		String[] arr=string.split(" ",0);
		for (String string2 : arr) {
			if(map.containsKey(string2)) {
				Integer c=map.get(string2);
				c++;
				map.put(string2,c);
			}
			else
			{
				map.put(string2,1);
			}	
		}
		
		return map;
	}
	
	private static Map<String, Object> storeInfo(Object o) {
		// TODO Auto-generated method stub
		//String S=new String("ID");
//		Map<String,Object> i = new HashMap<String, Object>() ;
//		i.put(products.getName(),products.getCategory());
//		System.out.println(i);
//		i.put(products.getCategory(),products.getClass());
//		System.out.println(i);
		/*
		 * 
		 */
//		String string = new String("and and as as will");
//		Map<String,Integer> getWordFrequency(string);
		
		
		Map<String,Object> i = new HashMap<String, Object>() ;
		Class<?> clazz = o.getClass();
		Method[] methods = clazz.getMethods();
		for(Method m : methods)
		{
			if(m.getName().startsWith("get")) {
				try {
					Object ret = m.invoke(o);
					i.put(m.getName().substring(3),ret);
				} catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		return i;
	}
}
