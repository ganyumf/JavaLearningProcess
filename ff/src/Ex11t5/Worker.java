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

public class Worker extends Employee{
	char category;
	boolean dressAllowance;
	public Worker(String name, char sex,boolean dressAllowance) {
		super(name, sex);
		this.dressAllowance=dressAllowance;
	}
	public void isDressAll(){
		if (dressAllowance==true)
		{System.out.println("���Ž���");}
		else {System.out.println("�����Ž���");}
	}
}
