package package2;

public class RotationCount_in_RotatedSortedArray {
	public static int RotationCount(int []arr) 
	{
		int count=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i-1]>arr[i])
				count=i;
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int []arr= {3,4,5,6,7,0,1,2};
		//int []arr= {2,9,2,2,2,2};
		int []arr= {3,4,5,6,2};
		int res=RotationCount_in_RotatedSortedArray.RotationCount(arr);
        System.out.println(res);

	}

}
