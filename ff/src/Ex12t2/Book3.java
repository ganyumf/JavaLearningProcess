/*
 2.��дһ����Book3������̲ģ�
�������ԣ����ƣ�title����ҳ����pageNum�������ࣨtype��
���з�����detail�������ڿ���̨���ÿ���̲ĵ����ơ�ҳ��������

�����������ι��췽����
��һ�����췽���У����ý̲�����Ϊ������������̶������������Ե�ֵ�ɲ���������
�ڶ������췽���У��������Ե�ֵ���ɲ�������

��д������Book3Test���в��ԣ�
�ֱ������ַ�ʽ��ɶ�����Book3����ĳ�ʼ�����������ֱ�������ǵ�detail��������������Ƿ���ȷ
 */
package Ex12t2;

public class Book3 {
String title;
int pageNum;
String type;
public void detail()
	{
		
	}
public Book3(String title, int pageNum, String type) {
	super();
	this.title = title;
	this.pageNum = pageNum;
	this.type = type;
}
public Book3(String title, int pageNum) {
	super();
	type="�����";
	this.title = title;
	this.pageNum = pageNum;
}
public static void main(String[] args) {
	Book3 a=new Book3("�������",256);
	Book3 b=new Book3("��Ӱ����",128,"����");
	System.out.println(a.type);
	System.out.println(b.type);
	
}
}
