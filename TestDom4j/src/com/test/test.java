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
//	dom4j  ���� ������xml
//	document  �ĵ�
//	Element   �ڵ㣨Ԫ�أ�
//�ȴ���document����
//��Ӹ��ڵ� ����� �ӽڵ�
	Document dom=DocumentHelper.createDocument();//�����ĵ�
		Element rootele=DocumentHelper.createElement("Person");
			dom.setRootElement(rootele);
		
		Element name=DocumentHelper.createElement("name");
//		name.setText("ղķ˹");
		name.addAttribute("value", "ղķ˹");
//		<name>ղķ˹</name> --><name value="ղķ˹">
		
		rootele.add(name);//����ڵ�������ӽڵ�
		
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
		pname.setText("����");
		page.setText("2");
		ptype.setText("����");
		pet.add(pname);
		pet.add(page);
		pet.add(ptype);
		rootele.add(pet);
		
		//��ʽ��                                                                   ����     �Ƿ���
		OutputFormat opf=new OutputFormat("  ",true,"gbk");
		
		try {
			XMLWriter writer=new XMLWriter(new FileOutputStream("c:/test/xx.xml"),opf);
			writer.write(dom);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		<Person>
//		<name>ղķ˹</name>
//		</Person>
	}
}
