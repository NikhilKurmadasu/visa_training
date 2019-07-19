package com.visa.prj.web;

import java.io.IOException;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class GameServlet
 */
@WebServlet("/check")
public class GameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GameServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(true);
		//System.out.println("HIII");
		String ans="ROHITH";
		System.out.println(ans.length());
		StringBuilder ans1=new StringBuilder("******");//request.getParameter("letters"));
		//System.out.println(ans1);
		//System.out.println("HIII");
		String c=request.getParameter("letter");
		c="r*****";
		System.out.println(c);
		
//		for (int i=0;i<ans.length();i++) {
//			 if(c.charAt(0)==ans.charAt(i)) {
//				 ans1.setCharAt(i, ans.charAt(i));
//			}
		//}
		ans1.toString();
		session.setAttribute("letters", ans1);
		System.out.println(ans1);
		response.sendRedirect("game.html?letters="+ans1);
		
	}

}
