
public class BinarySearch {
	public static int search(int []arr,int key)
	{
		int s=0;
		int e=arr.length-1;
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
		// TODO Auto-generated method stub
		int[]a= {2,3,5,7,9,12,13};
		int key=12;
		int res=search(a,key);
		System.out.println(res);

	}

}
