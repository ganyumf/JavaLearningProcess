package Ex12t3;

public class Faculty extends Employee{
	String degree;
	String level;
	public void shuchu(){
		super.shuchu();
		System.out.println("ѧλ��"+degree);
		System.out.println("����"+level);
	}
	public Faculty(String name, String address, String telphone, String email,
			String office, String wage, String hireday, String degree,
			String level) {
		super(name, address, telphone, email, office, wage, hireday);
		this.degree = degree;
		this.level = level;
	}
	public Faculty() {
		// TODO Auto-generated constructor stub
	}
	
	

}
