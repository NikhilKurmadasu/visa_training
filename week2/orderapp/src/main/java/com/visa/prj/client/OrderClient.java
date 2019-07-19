package com.visa.prj.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.visa.prj.entity.Customer;
import com.visa.prj.entity.Item;
import com.visa.prj.entity.Order;
import com.visa.prj.entity.Product;
import com.visa.prj.service.OrderService;

public class OrderClient {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		// AnnotationConfigApplicationContext ctx=new
		// ClassPathXmlBeanApplicationContext("");
		ctx.scan("com.visa");
		ctx.refresh();
		OrderService service = ctx.getBean("orderService", OrderService.class);
		Customer c=new Customer();
		c.setEmail("a@visa.com");
		Order o=new Order();
		o.setCustomer(c);
		Product p1=service.getProduct(10);
		Product p2=service.getProduct(11);
		Item i1=new Item();
		i1.setQty(10);
		i1.setProduct(p1);
		i1.setAmount(p1.getPrice()*i1.getQty());
		
		Item i2=new Item();
		i2.setQty(5);
		i2.setProduct(p2);
		i2.setAmount(p2.getPrice()*i2.getQty());
		
		o.getItems().add(i1);
		o.getItems().add(i2);
		service.executeOrder(o);
		

//		String[] names = ctx.getBeanDefinitionNames();
//		for (String name : names) {
//			System.out.println(name);
//		}
//
//		OrderService service = ctx.getBean("orderService", OrderService.class);
//		Product p = new Product(0, "camlin Whiteboard Maker", "stationary", 120, 5000);
//		service.addProduct(p);
//		
//		List<Product> products=service.getProducts();
//		for (Product product : products) {
//			System.out.println(product.getName()+","+product.getPrice());
//		}
	}

}
