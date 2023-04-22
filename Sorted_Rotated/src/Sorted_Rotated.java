
public class Sorted_Rotated {
	public static boolean myArray(int []arr)
	{
		int len=arr.length;
		int count=0;
		for(int i=1;i<len;i++)
		{
			if(arr[i-1]>arr[i])
				count++;
		}
		return count==1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int []arr= {3,4,5,1,2};
		//int []arr= {2,1,3,4};
		int []arr= {2,1,3,4,2};
		System.out.println(myArray(arr));

	}

}
