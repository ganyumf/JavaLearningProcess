/*
6.ʹ��static ���� ����String name ������������������������޸�����һ�������nameֵ ����ӡ���������nameֵ
7.static ���η���������ֱ��ʹ�� ����.���� ����
ʹ��static ���� �Զ��巽������ӡ�������ݡ�
 */
package Ex12t67;

public class temp {
	static String name;
	static void print()
	{
		System.out.println("��̬����");
	}
	public static void main(String[] args) {
		temp a=new temp();
		a.name="cjy";
		temp b=new temp();
		a.name="acx";
		temp c=new temp();
		a.name="zdl";
		System.out.println(temp.name);
		temp.print();
	}
}
