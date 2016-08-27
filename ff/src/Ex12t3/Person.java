package Ex12t3;

public class Person {
	String name;
	String address;
	String telphone;
	String email;
	public void shuchu(){
		System.out.println("名字:"+name);
		System.out.println("地址:"+address);
		System.out.println("电话:"+telphone);
		System.out.println("邮件:"+email);
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
