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
		//��ȡxx.xml �ļ�
		SAXReader sr=new SAXReader();
		try {
			Document dom=sr.read(new File("c:/test/xx.xml"));
		Element root=dom.getRootElement();
			System.out.println(root.getName());
		//	List<Element> childs=root.elements();//�ýڵ��µ��ӽڵ�
		Element age=root.element("age");
		System.out.println(age.getText());
		Element name=root.element("name");
		Attribute attr=name.attribute("value");
		System.out.println(attr.getName()+"-"+attr.getValue());
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//json  {name:'ղķ˹',age:22,pet:{pname:'����',page:2,ptype:'����'}}

//ע��  ȡ��  xml
//		���  ����+xml
		
	}
}
