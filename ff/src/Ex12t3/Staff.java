package Ex12t3;

public class Staff extends Employee{
	String duty;
	public void shuchu(){
		super.shuchu();
		System.out.println("ְλ:"+duty);
	}
	public Staff(String name, String address, String telphone, String email,
			String office, String wage, String hireday, String duty) {
		super(name, address, telphone, email, office, wage, hireday);
		this.duty = duty;
	}
	public Staff() {
		// TODO Auto-generated constructor stub
	}

}
