package List;

import java.util.Arrays;

public class TestJiHe {
	//�ܹ�����ͬ�����Ͷ��Ԫ�ص�  ����
	//����ĳ����ǹ̶���
	//����������� Ԫ�� ���������
	int []arr=new int[3];
	int index=0;//��¼���ݴ浽�ĸ�λ����
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
		//���������ĸ�Ԫ�� ����ô��
		//���������� ����:arr.length+1;
		//�������� �ٽ������ݷ������
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
