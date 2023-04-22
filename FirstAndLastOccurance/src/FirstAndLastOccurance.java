import java.util.Scanner;

public class FirstAndLastOccurance {
	public static int myFun1(int[]arr,int key)
	{
		int s=0;
		int e=arr.length-1;
		int mid1=(s+e)/2;
		int ans=0;
		while(s<=e)
		{
			if(arr[mid1]==key)
			{
				e=mid1-1;
			    ans=mid1;
			}
			if(key<arr[mid1])
				e=mid1-1;
			if(key>arr[mid1])
				s=mid1+1;
			mid1=(s+e)/2;
		}
		return ans;
		
	}
	
	public static int myFun2(int[]arr,int key)
	{
		int s=0;
		int e=arr.length-1;
		int mid2=(s+e)/2;
		int ans=0;
		while(s<=e)
		{
			if(arr[mid2]==key)
			{ 
				s=mid2+1;
				ans=mid2;
			}
			if(key<arr[mid2])
				e=mid2-1;
			if(key>arr[mid2])
				s=mid2+1;
			mid2=(s+e)/2;
		}
		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {5,7,7,8,8,10};
		int key=7;
//		myFun1(arr,key);
//		myFun2(arr,key);
		System.out.println(myFun1(arr,key)+" "+myFun2(arr,key));

	}

}
