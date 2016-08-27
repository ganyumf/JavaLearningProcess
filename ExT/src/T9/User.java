package T9;
public class User{
	
	 int userId;
	 String password;
	 String e_mail;
	 
	public User(int userId, String password) {
	  this.userId = userId;
	  this.password = password;
	  this.e_mail = userId + "@gameschool.com";
	 }
	 
	 public User(int userId, String password, String e_mail) {
	  this.userId = userId;
	  this.password = password;
	  this.e_mail = e_mail;
	 }
	 
	 public String toString() {
	return "userId: " + userId + "\tpassword: " + password + "\tE-mail: " + e_mail; 
	 }
	 
	 public static void main(String[] args) {
	  User su1 = new User(1232313, "jih2232hg!d");
	  System.out.println(su1);
	 User su2 = new User(1232313, "jih2232hg!d", "xsds@163.com");
	  System.out.println(su2);
	 }
	} 
