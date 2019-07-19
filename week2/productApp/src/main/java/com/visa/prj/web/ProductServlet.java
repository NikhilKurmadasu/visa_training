package com.visa.prj.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.visa.prj.dao.FetchException;
import com.visa.prj.dao.PersistenceException;
import com.visa.prj.dao.ProductDao;
import com.visa.prj.dao.ProductDaoJdbImpl;
import com.visa.prj.entity.Product;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/products")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public ProductServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		// TODO Auto-generated method stub

		ProductDao productDao = new ProductDaoJdbImpl();
		try {
			List<Product> products = productDao.getProducts();
			request.setAttribute("products", products);
			request.getRequestDispatcher("products.jsp").forward(request, response);
		} catch (FetchException e) {
			e.printStackTrace();
		}
		// PrintWriter out = response.getWriter();
//		response.setContentType("text/html");
//		out.print("<html><body>");
//		out.print("<h1>Product List</h1>");
//		out.print("<table border='1'>");
//		
//		ProductDao productDao=new ProductDaoJdbImpl(); 
//			try {
//				List<Product> products=productDao.getProducts();
//				for (Product product : products) {
//					out.print("<tr>");
//						out.print("<td>"+product.getId()+"</td>");
//						out.print("<td>"+product.getName()+"</td>");
//						out.print("<td>"+product.getPrice()+"</td>");
//						out.print("<td>"+product.getCategory()+"</td>");
//					out.print("</tr>");
//						
//				}
//			}
//				catch(FetchException e) {
//					e.printStackTrace();
//				}
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Product p = new Product();
		p.setName(request.getParameter("name"));
		p.setCategory(request.getParameter("category"));
		p.setCount(Integer.parseInt(request.getParameter("count")));
		p.setPrice(Double.parseDouble(request.getParameter("price")));

		ProductDao productDao = new ProductDaoJdbImpl();
		try {
			int id = productDao.addProduct(p);
			response.setContentType("text/html");
			response.getWriter().println("product added with id :" + id);
			response.getWriter().println("<br/> <a href='index.html'>Back</a> ");
		} catch (PersistenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		int id=Integer.parseInt(request.getParameter("id"));
//		try {
//			response.set
//		}
	}

}
