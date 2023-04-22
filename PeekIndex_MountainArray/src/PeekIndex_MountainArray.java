
public class PeekIndex_MountainArray {
	public static int Mountain(int []arr)
	{
		int s=0;
		int e=arr.length-1;
		int mid=(s+e)/2;
		while(s<e) {
			if(arr[mid]<arr[mid+1])
				s=mid+1;
			else
				e=mid;
			mid=(s+e)/2;
		}
		return arr[mid];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {3,4,5,6,12,2,1};
		System.out.println(Mountain(arr));

	}

}
