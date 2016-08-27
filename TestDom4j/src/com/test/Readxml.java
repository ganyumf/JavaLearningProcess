package com.test;

import java.io.File;
import java.util.List;



import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Readxml {
	public static void main(String[] args) {
		//读取xx.xml 文件
		SAXReader sr=new SAXReader();
		try {
			Document dom=sr.read(new File("c:/test/xx.xml"));
		Element root=dom.getRootElement();
			System.out.println(root.getName());
		//	List<Element> childs=root.elements();//该节点下的子节点
		Element age=root.element("age");
		System.out.println(age.getText());
		Element name=root.element("name");
		Attribute attr=name.attribute("value");
		System.out.println(attr.getName()+"-"+attr.getValue());
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//json  {name:'詹姆斯',age:22,pet:{pname:'闪电',page:2,ptype:'考拉'}}

//注解  取代  xml
//		框架  反射+xml
		
	}
}
