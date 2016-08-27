package QS;

public class Method {
	
	
	public void Sort(int[] arr)
	{
		
		SqList L=new SqList();
		L.r=arr;
		QuickSort(L);
		
		
		
//		SqList L=new SqList();
//		L.r[0]=0;
//		System.arraycopy(arr,0,L.r,1,arr.length);
//		L.length=arr.length;
//		QuickSort(L);
//		int []result=new int[arr.length];
//		System.arraycopy(L.r,1,result,0,arr.length);
//		arr=result;
		
		
		
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}
	
	
	public void QuickSort(SqList L)
	{
		QSort(L,1,L.length);
	}
	
	public void QSort(SqList L,int low,int high)
	{
		int pivot;// ‡÷µ
		if(low<high)
		{
			pivot=Partition(L,low,high);
			QSort(L,low,pivot-1);
			QSort(L,pivot+1,high);
		}
	}
	public int Partition(SqList L,int low,int high)
	{
		int pivotkey;
		pivotkey=L.r[low];
		while(low<high)
		{
			while(low<high&&L.r[high]>=pivotkey)
				high--;
			swap(L,low,high);
			while(low<high&&L.r[low]<=pivotkey)
				low++;
			swap(L,low,high);
		}
		return low;
	}
	public void swap(SqList L,int x,int y)
	{
		int temp=L.r[x];
		L.r[x]=L.r[y];
		L.r[y]=temp;
	}
	
}
