package Ex12t3;

public class Employee extends Person{
	String office;
	String wage;
	String hireday;
	public void shuchu(){
		super.shuchu();
		System.out.println("�칫��:"+office);
		System.out.println("����:"+wage);
		System.out.println("�ܹ�����:"+hireday);
	}
	public Employee(String name, String address, String telphone, String email,
			String office, String wage, String hireday) {
		super(name, address, telphone, email);
		this.office = office;
		this.wage = wage;
		this.hireday = hireday;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	

}
