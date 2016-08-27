package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.TmobileDao;

public class TmobileServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public TmobileServlet() {
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
		
		String tjsp=request.getParameter("hid");
		String tservlet=request.getSession().getAttribute("tservlet").toString();
		if(!tjsp.equals(tservlet)){
			request.setAttribute("message", "<script>alert('请勿重复提交!')</script>");
			request.getRequestDispatcher("token.do").forward(request, response);
		}
		else{
		request.getSession().setAttribute("tservlet",tservlet+1 );
		String start=request.getParameter("T1");
		String end=request.getParameter("T2");
		String type=request.getParameter("R1");
		TmobileDao td=new TmobileDao();
		boolean result=td.piliangAdd(start, end, type);
		if(result==true){
			request.setAttribute("message", "<script>alert('批量添加成功!')</script>");
			request.getRequestDispatcher("token.do").forward(request, response);
		}else {
			request.setAttribute("message", "<script>alert('批量添加失败!')</script>");
			request.getRequestDispatcher("token.do").forward(request, response);
		}
		}
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
