/*
 ��ҹ�˾�������Ӧ���и����������ԣ�
��Ƽ����Ҿ��࣬Ȼ���ҹ�˾�и�װ���ķ�����
����һ������ķ�������վ����ʾ�Ѿ��ᵽ�ط��ˣ�
Ȼ���г������嵥
 
��ҹ�˾                ��                 �Ҿ� 
    ��                   �Ҿ� ����             ��
װ���ķ���        ����ķ���  
		       ��������嵥
 */
package t2_��ҹ�˾;

public class Company {
	String cname;
	Car c=new Car();
	public Company() {
		// TODO Auto-generated constructor stub
	}
	public Company(String cname, Car c) {
		super();
		this.cname = cname;
		this.c = c;
	}
	public void upLoad(Furniture []tarr)
	{
		c.arr=tarr;
	}
	public static void main(String[] args) {
		
		Sofa a1=new Sofa("sofa");
		Furniture a2=new Furniture("fridge");
		Furniture a3=new Furniture("TV");
		Furniture []tarr={a1,a2,a3};
		
		Company comp=new Company();
		comp.upLoad(tarr);
		comp.c.trans();
		comp.c.arrival=true;
		comp.c.print(comp.c.arrival);
	}
}
