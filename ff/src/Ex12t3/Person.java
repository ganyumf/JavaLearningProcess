package Ex12t3;

public class Person {
	String name;
	String address;
	String telphone;
	String email;
	public void shuchu(){
		System.out.println("����:"+name);
		System.out.println("��ַ:"+address);
		System.out.println("�绰:"+telphone);
		System.out.println("�ʼ�:"+email);
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String name, String address, String telphone, String email) {
		//super();
		this.name = name;
		this.address = address;
		this.telphone = telphone;
		this.email = email;
	}

}
