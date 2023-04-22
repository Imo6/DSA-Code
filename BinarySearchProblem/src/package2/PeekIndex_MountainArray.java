package package2;

public class PeekIndex_MountainArray {
	public static int PeekIndex(int []arr) 
	{
		int start=0;
		int end=arr.length;
		//int mid=start+(end-start)/2;
		while(start<end)
		{
			int mid=start+(end-start)/2;
			if(arr[mid]>arr[mid+1])
				end=mid;
			else if(arr[mid]<arr[mid+1])
				start=mid+1;
		}
		return end;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,5,6,4,3,2};
		//int []arr= {0,1,0};
		int res=PeekIndex_MountainArray.PeekIndex(arr);
		System.out.println(res);

	}

}
