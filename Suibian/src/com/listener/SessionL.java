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
		System.out.println("������ HttpSessionListener ����");
	}
	 public void requestDestroyed(ServletRequestEvent sre) { 
		  System.out.println("requestDestroyed"+sre.getServletRequest().hashCode());
	}
	 public void requestInitialized(ServletRequestEvent sre) { 
		System.out.println("requestInitialized"+sre.getServletRequest().hashCode());
	}
	  // ����   ÿ�� ������ ������
	  //session ��һ ʧЧ 
	 
	 
	//����  session ���� �Ĵ�������
	public void sessionCreated(HttpSessionEvent arg0) { 
	System.out.println("������ session ����"+arg0.getSession().getId());
	System.out.println(arg0.getSession());
	  arg0.getSession().getServletContext(); //-->application
 
	} 
	public void sessionDestroyed(HttpSessionEvent arg0) { 
   System.out.println("������ session ���� "+arg0.getSession().getId());
   System.out.println(arg0.getSession());
	}
	
	
	public void contextDestroyed(ServletContextEvent sce) {
		 System.out.println("������application ���� ");
	}
	public void contextInitialized(ServletContextEvent sce) {
		
		 System.out.println("������application ���� ");
	}
	
	
	
	
	
	
	
	

}
