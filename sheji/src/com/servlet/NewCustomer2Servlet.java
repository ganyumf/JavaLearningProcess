package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.TCustomerDao;
import com.entity.TCustomer;

public class NewCustomer2Servlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public NewCustomer2Servlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String idType=request.getSession().getAttribute("d1").toString();
		String idNumber=request.getSession().getAttribute("t2").toString();
		String customerName=request.getParameter("T1");
		String customerBirtyday=request.getParameter("T3");
		String customerSex=request.getParameter("R1");
		String customerAddress=request.getParameter("T4");
		System.out.println(idType);
		TCustomer t=new TCustomer();
		t.setCustomerAddress(customerAddress);
		t.setCustomerBirtyday(customerBirtyday);
		t.setCustomerName(customerName);
		t.setCustomerSex(customerSex);
		t.setIdNumber(idNumber);
		t.setIdType(idType);
		TCustomerDao tc=new TCustomerDao();
		tc.addCustomer(t);
		
		request.getSession().setAttribute("currentCustomer", tc.findCustomerById(t.getIdNumber()));
		request.getRequestDispatcher("newUser.jsp").forward(request, response);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
