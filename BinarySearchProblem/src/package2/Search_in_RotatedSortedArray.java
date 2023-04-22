package package2;

public class Search_in_RotatedSortedArray {
	public static int RotatedSortedArray(int []arr,int target)
	{
		int peek=PeekIndex(arr);
		int start=0;
		int end=arr.length-1;
		int firstTry=BinarySearch(arr,target,start,peek);
		if(firstTry!=-1)
			return firstTry;
		start=peek+1;
		return BinarySearch(arr,target,start,end);	
		
	}
	public static int PeekIndex(int []arr) 
	{
		int index=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i-1]>arr[i])
				index=i-1;
		}
		
		return index;
	}
	
	public static int BinarySearch(int []arr,int target,int start,int end)
	{
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(target==arr[mid])
				return mid;
			else if(target>arr[mid])
				start=mid+1;
			else
				end=mid-1;
			
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int []arr= {3,4,5,6,7,0,1,2};
		int []arr= {2,9,2,2,2,2};
		int res=Search_in_RotatedSortedArray.RotatedSortedArray(arr,9);
        System.out.println(res);
	}

}
