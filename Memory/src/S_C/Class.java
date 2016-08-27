package S_C;

public class Class {
	Student stu[];
	String name;
	public Class(Student[] stu, String name) {
		super();
		this.stu = stu;
		this.name = name;
	}
	public void Meeting()
	{
		for(Student s:stu)
		{
			System.out.println("我叫"+s.name+"  我的学号是"+s.number);
		}
	}
	public static void main(String[] args) {
		Student a=new Student("cjy",20134254);
		Student b=new Student("acx",20134245);
		Student []arr={a,b};
		Class c=new Class(arr,"计一青年欢乐多");
		c.Meeting();
	}
}
