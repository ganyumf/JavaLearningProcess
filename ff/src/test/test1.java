package test;
public class test1 {
	public int sum(int ... arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		return sum;
	}
	public void eat(String food)
	{
		System.out.println("��"+food);
	}
	public void sleep()
	{
		System.out.println("˯��");
	}
	public void beatBean()
	{
		System.out.println("�򶹶�");
	}
	public void oneDay()
	{
		eat("��ͷ");
		sleep();
		beatBean();
	}
	public static void main(String[] args) {
		test1 h=new test1();
		int s=h.sum(1,2,3,4,5,6,7,8,9,10);
		System.out.println(s);
	}
}
