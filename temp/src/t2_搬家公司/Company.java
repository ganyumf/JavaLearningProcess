/*
 搬家公司，这个类应该有个货车的属性，
设计几个家具类，然后搬家公司有个装车的方法，
车有一个运输的方法，到站后提示已经搬到地方了，
然后列出货物清单
 
搬家公司                车                 家具 
    车                   家具 数组             名
装车的方法        运输的方法  
		       输出货物清单
 */
package t2_搬家公司;

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
