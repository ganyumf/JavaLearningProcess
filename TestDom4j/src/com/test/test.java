package com.test;

import java.io.FileOutputStream;
import java.io.IOException;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class test {
public static void main(String[] args) {
//	dom4j  解析 和生成xml
//	document  文档
//	Element   节点（元素）
//先创建document对象
//添加根节点 再添加 子节点
	Document dom=DocumentHelper.createDocument();//创建文档
		Element rootele=DocumentHelper.createElement("Person");
			dom.setRootElement(rootele);
		
		Element name=DocumentHelper.createElement("name");
//		name.setText("詹姆斯");
		name.addAttribute("value", "詹姆斯");
//		<name>詹姆斯</name> --><name value="詹姆斯">
		
		rootele.add(name);//向根节点中添加子节点
		
		Element age=DocumentHelper.createElement("age");
		age.setText("22");
		rootele.add(age);
		
//		<pet>
//		<pname><page><ptype>
//		</pet>
		Element pet=DocumentHelper.createElement("pet");
		Element pname=DocumentHelper.createElement("pname");
		Element page=DocumentHelper.createElement("page");
		Element ptype=DocumentHelper.createElement("ptype");
		pname.setText("闪电");
		page.setText("2");
		ptype.setText("考拉");
		pet.add(pname);
		pet.add(page);
		pet.add(ptype);
		rootele.add(pet);
		
		//格式化                                                                   缩进     是否换行
		OutputFormat opf=new OutputFormat("  ",true,"gbk");
		
		try {
			XMLWriter writer=new XMLWriter(new FileOutputStream("c:/test/xx.xml"),opf);
			writer.write(dom);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		<Person>
//		<name>詹姆斯</name>
//		</Person>
	}
}
