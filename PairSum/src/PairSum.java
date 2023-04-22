
class MyClass
{
	public void pairsum(int[]arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length-1;j++)
			{
				if((arr[i]+arr[j])==5)
				{
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}
}

public class PairSum {

	public static void main(String[] args) {
		MyClass m=new MyClass();
		int [] arr= {1,2,3,4,5};
		m.pairsum(arr);

	}

}
