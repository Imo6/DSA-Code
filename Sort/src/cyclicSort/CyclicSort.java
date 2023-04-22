package cyclicSort;

public class CyclicSort {
	public static void sort(int a[])
	{
		int i=0;
		while(i<a.length) 
		{
			int correctIndex=a[i]-1;
			if(a[i]!=a[correctIndex]) {
				//swap
				int temp=a[i];
				a[i]=a[correctIndex];
				a[correctIndex]=temp;
			}
			else {
				i++;
			}
		}
		for(int j=0;j<a.length;j++) {
			System.err.print(a[j]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int []a= {5,4,3,1,2};
		int []a= {6,5,4,3,2,1};
		sort(a);
		

	}

}
