/*
 1.������Ա��Teacher��Ҫ��
�������ԣ����������䡢ѧ����ְλ
������Ϊ�����ҽ���
��дһ�������࣬Ҫ��
ʵ����һ����Ա���󣬲������ʼ��
�ڿ���̨����ý�Ա�����ҽ���
 */
package Ex12t1;

public class Teacher {
	String name;
	int age;
	String eduBG;
	String Position;
	public void intro()
	{
		System.out.println("�ҽ�"+name);
		System.out.println(age);
		System.out.println(eduBG);
		System.out.println(Position);
	}
	public Teacher(String name,int age,String eduBG,String Position)
	{
		this.age=age;
		this.name=name;
		this.eduBG=eduBG;
		this.Position=Position;
	}
public static void main(String[] args) {
	Teacher t=new Teacher("acx",22,"����","��ʦ");
	t.intro();
}
}
