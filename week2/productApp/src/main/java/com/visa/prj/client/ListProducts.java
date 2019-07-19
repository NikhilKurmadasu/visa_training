package com.visa.prj.client;

import java.util.List;

import com.visa.prj.dao.FetchException;
import com.visa.prj.dao.PersistenceException;
import com.visa.prj.dao.ProductDao;
import com.visa.prj.dao.ProductDaoJdbImpl;
import com.visa.prj.entity.Product;

public class ListProducts {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		ProductDao productDao=new ProductDaoJdbImpl();
		try {
			List<Product> prds=productDao.getProducts();
//			Product pr = new Product(0,"HP Specter Laptop","computer", 135000.00,520);
//			productDao.addProduct(pr);
			for(Product p: prds) {
				System.out.println(p.getName()+","+ p.getPrice() +" ");
			} }catch(FetchException e) {
				e.printStackTrace();
			}
		}
}
