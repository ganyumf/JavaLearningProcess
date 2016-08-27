package Ex13t1;

public class xStudent extends Student{

	@Override
	public void laugh() {
		// TODO Auto-generated method stub
		System.out.println("xstudent haha");
	}
	public static void main(String[] args) {
		Student s=new xStudent();
		s.laugh();
	}
}
