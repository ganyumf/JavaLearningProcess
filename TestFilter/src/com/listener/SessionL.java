package com.listener;


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionL implements HttpSessionListener,ServletRequestListener,ServletContextListener{
	int count=0;
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("销毁了application对象");
		
	}
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("创建了application对象");

		
	}
	
	
	
	
	
	
	
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("requestDestroyed"+sre.getServletRequest().hashCode());
	}
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("requestInitialized"+sre.getServletRequest().hashCode());
	}
	//请求每次都创建并销毁
	
	
	
	
	public SessionL() {
		System.out.println("创建了HttpSessionListener对象");
	}
	
	//监视session 对象的创建方法
	public void sessionCreated(HttpSessionEvent arg0) {
		System.out.println("创建了session对象"+arg0.getSession().getId());
		
		System.out.println(arg0.getSession());
		if(arg0.getSession().getServletContext().getAttribute("count")==null)
    	{
    		count=0;
    	}else{
    		count= Integer.parseInt(arg0.getSession().getServletContext().getAttribute("count").toString());
    	}
		arg0.getSession().setAttribute("count", count+1);
		//	arg0.getSession().getServletContext();
	}
	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("销毁了session对象"+arg0.getSession().getId());
		System.out.println(arg0.getSession());
		int count=(Integer) arg0.getSession().getServletContext().getAttribute("count");
		arg0.getSession().getServletContext().setAttribute("count", count-1);
	}
	
}
