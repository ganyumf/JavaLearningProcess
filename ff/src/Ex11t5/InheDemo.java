/*
����Employee   ���ԣ�name��sex , ��һ�����췽��Employee(String n, char s)
���� Worker�̳���Employee  ���ԣ�char category;//��� 
boolean dressAllowance; //�Ƿ��ṩ��װ���� �� ��һ�����췽�� �������������ԣ�
����һ���Զ��巽�� isDressAll() ������� ����ͨ���ж�dressAllowance��ֵ��� ���Ƿ��ṩ��װ������
�½�һ���������InheDemo 
��main�������½�һ��Worker����������������������� 
������isDressAll()�����õ�������Ϣ
 */
package Ex11t5;

public class InheDemo {
public static void main(String[] args) {
	Worker w=new Worker("cjy",'��',true);
	
	System.out.println(w.name);
	System.out.println(w.sex);
	w.isDressAll();
}
}
