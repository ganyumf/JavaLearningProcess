/*
 3����дһ������һ��ѧ����Student������������У�ѧ��studentId���༶��classId������studentName������studentAge���Ա�studentSex��
	����Ĳ��������У����ѧ�š���ð༶�š�����������Ա��������䡣
 */
package Ex9t3;

public class Student {
	int studentID;
	int classId;
	String studentName;
	int studentAge;
	char studentSex;
	public int getStudentID()
	{
		return this.studentID;
	}
	public int getClassId()
	{
		return this.classId;
	}
	public String getStudentName()
	{
		return this.studentName;
	}
	public char getStudentSex()
	{
		return this.studentSex;
	}
	public void setStudentAge(int age)
	{
		this.studentAge=age;
	}
}
