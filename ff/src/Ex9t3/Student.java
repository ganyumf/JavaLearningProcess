/*
 3、编写一程序定义一个学生类Student，该类的属性有：学号studentId、班级号classId、姓名studentName、年龄studentAge、性别studentSex；
	该类的操作方法有：获得学号、获得班级号、获得姓名、性别、设置年龄。
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
