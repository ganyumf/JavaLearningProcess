//1.2.7.��֪��ʮ��֧��������Ӳμ�2008 �������˻ᡣдһ�����򣬰���16 ֧��������Ϊ4 ���顣
//ע����������б����¼
//ע2��ʹ��Math.random ���������������Ҳ����ʹ������������
//2. 2008 �������˻�����������ң�
//���ص��ߣ�����͢���Ĵ����ǣ�����ά�ǣ��������������ǡ��ձ����������й���
//������������������ʱ������������¡���鶼��˹�������
package JHt127;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		Random rd=new Random();
		ArrayList <String>al=new ArrayList<String>();
		al.add("���ص���");
		al.add("����͢");
		al.add("�Ĵ�����");
		al.add("����ά��");
		al.add("����");
		al.add("��������");
		al.add("�ձ�");
		al.add("����");
		al.add("�й�");
		al.add("������");
		al.add("����");
		al.add("����ʱ");
		al.add("����");
		al.add("����¡");
		al.add("�鶼��˹");
		al.add("�����");
		for (int i = 0; al.size()>0; i++) {
			int j=rd.nextInt(al.size());
			System.out.println(al.get(j));
			if((i+1)%4==0)System.out.println("-----------------------------");
			al.remove(j);
		}
	}
}
