package com.listener;

import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class SessionAttr implements HttpSessionAttributeListener {
  public void attributeAdded(HttpSessionBindingEvent arg0) {
  System.out.println("session值域中添加了:"+ arg0.getName()+"--"+arg0.getValue());
 }
  public void attributeRemoved(HttpSessionBindingEvent arg0) {
 System.out.println("移除了"+arg0.getName()+"--"+arg0.getValue());
	}
  public void attributeReplaced(HttpSessionBindingEvent arg0) {
	System.out.println("替换了"+arg0.getName()+"--"+arg0.getValue());
	}
	
	
}
