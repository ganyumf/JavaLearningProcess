/*
 9.��1������һ����Ϸ��Hero Ӣ�۵��࣬�ڸ����ж���Ӣ�۵����֣� ����ֵ�͵ȼ�3 �����ԣ�����һ�����캯����ɶ�����ֵ�͵ȼ��ĳ�ʼ�����ֱ𸳳�ֵΪ100��1��
 ͬʱʵ�����ֵ������Ӣ����Ϣ�������
��2������һ��Ļ����ϣ�ΪӢ���ٶ���ӵ��һ�������Ĺ��췽��������һ��Ӣ�����͵�ֵ�����Ϊ1����Ϊ��ͨӢ�ۣ�����ֵΪ100�������ֵΪ2����Ϊ�߼�Ӣ�ۣ�����ֵ��ʼ��Ϊ200��
��3��������Ӣ�����͵Ļ����ϣ�ΪӢ�����һ������ս���ķ����� �÷���ӵ��һ��Ӣ�����͵Ĳ�������������һ��Ӣ��ʱ���ܽ��ͶԷ�100 ��Ѫ��
 ������һ�����е����ط���������һ��ս�����Ͳ�����ͨ�����벻ͬ���в��������ͶԷ���ͬ��Ѫ����
 */
package Thero;
import java.util.*;
public class Hero {
String name;
int hp;
int level;
	public Hero()
	{
		hp=100;
		level=1;
	}
	public Hero(int heroz)
	{
		if(heroz==1){name="��ͨӢ��";hp=100;}
		if(heroz==2){name="�߼�Ӣ��";hp=200;}
	}
	public void setName()
	{	
		System.out.println("������Ӣ������");
		Scanner sc=new Scanner(System.in);
		name=sc.next();
	}
	public void display()
	{
		System.out.println("���֣�"+name);
		System.out.println("����ֵ��"+hp);
		System.out.println("�ȼ���"+level);
	}
	public void Attack()
	{
		
	}
}
