package com.listener;

import java.awt.print.Pageable;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionL implements HttpSessionListener,ServletRequestListener,ServletContextListener {
	public SessionL() {
		System.out.println("创建了 HttpSessionListener 对象");
	}
	 public void requestDestroyed(ServletRequestEvent sre) { 
		  System.out.println("requestDestroyed"+sre.getServletRequest().hashCode());
	}
	 public void requestInitialized(ServletRequestEvent sre) { 
		System.out.println("requestInitialized"+sre.getServletRequest().hashCode());
	}
	  // 请求   每次 都创建 并销毁
	  //session 第一 失效 
	 
	 
	//监视  session 对象 的创建方法
	public void sessionCreated(HttpSessionEvent arg0) { 
	System.out.println("创建了 session 对象"+arg0.getSession().getId());
	System.out.println(arg0.getSession());
	  arg0.getSession().getServletContext(); //-->application
 
	} 
	public void sessionDestroyed(HttpSessionEvent arg0) { 
   System.out.println("销毁了 session 对象 "+arg0.getSession().getId());
   System.out.println(arg0.getSession());
	}
	
	
	public void contextDestroyed(ServletContextEvent sce) {
		 System.out.println("销毁了application 对象 ");
	}
	public void contextInitialized(ServletContextEvent sce) {
		
		 System.out.println("创建了application 对象 ");
	}
	
	
	
	
	
	
	
	

}
