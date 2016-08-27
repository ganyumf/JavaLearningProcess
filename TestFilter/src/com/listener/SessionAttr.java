package com.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;


public class SessionAttr implements HttpSessionAttributeListener,ServletRequestAttributeListener,ServletContextAttributeListener{
	
	
	
	
	
	public void attributeAdded(HttpSessionBindingEvent arg0) {
		System.out.println("session值域中添加了"+arg0.getName()+"--"+arg0.getValue());
	}
	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		System.out.println("session值域中移除了"+arg0.getName()+"--"+arg0.getValue());
	}
	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		System.out.println("session值域中替换了"+arg0.getName()+"--"+arg0.getValue());
	}
	public void attributeAdded(ServletContextAttributeEvent scab) {
		// TODO Auto-generated method stub
		
	}
	public void attributeRemoved(ServletContextAttributeEvent scab) {
		// TODO Auto-generated method stub
		
	}
	public void attributeReplaced(ServletContextAttributeEvent scab) {
		// TODO Auto-generated method stub
		
	}
	public void attributeAdded(ServletRequestAttributeEvent srae) {
		// TODO Auto-generated method stub
		
	}
	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		// TODO Auto-generated method stub
		
	}
	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		// TODO Auto-generated method stub
		
	}
}
