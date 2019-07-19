package com.visa.prj.client;

import com.visa.prj.dao.PersistenceException;
import com.visa.prj.dao.ProductDao;
import com.visa.prj.dao.ProductDaoJdbImpl;
import com.visa.prj.entity.Product;

public class AddProduct {

	public static void main(String[] args) {
	ProductDao productDao=new ProductDaoJdbImpl();
	try {
		//List<Product> prds=productDao.getProducts();
		Product pr = new Product(0,"dell Specter Laptop","computer", 135000.00,520);
		int id=productDao.addProduct(pr);
		System.out.println("product added with id :"+id);
		}catch(PersistenceException e) {
		e.printStackTrace();
	}
}
}
