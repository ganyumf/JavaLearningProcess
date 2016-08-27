package List;

import java.util.Arrays;

public class TestJiHe {
	//能够容纳同种类型多个元素的  数组
	//数组的长度是固定的
	//向数组中添加 元素 放在最后面
	int []arr=new int[3];
	int index=0;//记录数据存到哪个位置了
	public void add(int num)
	{
		if(index<arr.length)
		{
			arr[index++]=num;
		}
		else
		{
			int []newarr=Arrays.copyOf(arr, (arr.length+1)*2);
			arr=newarr;
			arr[index++]=num;
		}
		display();
	}
	
	public void display()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		//int []arr={22,35,2};
		//如果想放入四个元素 该怎么办
		//创建新数组 长度:arr.length+1;
		//复制数组 再将新数据放入最后
		TestJiHe tjh=new TestJiHe();
		System.out.println("index:"+tjh.index);
		tjh.add(23);
		
		System.out.println("index:"+tjh.index);
		tjh.add(24);
		System.out.println("index:"+tjh.index);
		tjh.add(25);
		System.out.println("index:"+tjh.index);
		tjh.add(28);
		System.out.println("index:"+tjh.index);
		tjh.add(28);
		System.out.println("index:"+tjh.index);
		tjh.add(28);
		System.out.println("index:"+tjh.index);
	}
}
