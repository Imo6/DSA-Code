//
//public class Pivot_in_Array {
//	public static int getPivot(int []arr)
//	{
//		int s=0;
//		int e=arr.length-1;
//		int mid=(s+e)/2;
//		int ans=0;
//		while(s<e)
//		{
//			if(arr[mid]>=arr[0])
//				s=mid+1;
//			else
//			{
//				e=mid;
//				ans=mid;
//			}
//			mid=(s+e)/2;
//		}
//		return ans;
//		
//	}
//
//	public static void main(String[] args) {
//		// Sorted and Rotated is Array Given
//		int []arr= {7,9,18,2,3,5};
//		int index=getPivot(arr);
//		System.out.println(arr[index]);
//
//	}
//
//}


public class Pivot_in_Array {
	public static int getPivot(int []arr,int key)
	{
		int s=0;
		int e=arr.length-1;
		int mid=(s+e)/2;
		int ans=0;
		int flag=0;
		while(s<e)
		{
			if(arr[mid]>=arr[0])
			{
				s=mid+1;
			}
			else
			{
				e=mid;
				ans=mid;
			}
			mid=(s+e)/2;
		}
		if(key>=arr[ans] && key<=arr[e-1]){
			return BSearch(arr,ans,e-1,key);
		}
		else {
			return BSearch(arr,s,ans-1,key);
		}
		
	}
	
	public static int BSearch(int []arr,int s,int e,int key)
	{
		int mid=(s+e)/2;
		while(s<=e)
		{
			if(arr[mid]==key)
				return mid;
			if(key<arr[mid])
				e=mid-1;
			if(key>arr[mid])
				s=mid+1;
			mid=(s+e)/2;	
		}
		return -1;
	}

	public static void main(String[] args) {
		// Sorted and Rotated is Array Given find key
		int []arr= {7,9,18,2,3,5};
		int key=3;
//		getPivot(arr,key);
		System.out.println(getPivot(arr,key));

	}

}
