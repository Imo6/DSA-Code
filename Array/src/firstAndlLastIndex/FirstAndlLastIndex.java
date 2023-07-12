package firstAndlLastIndex;

public class FirstAndlLastIndex {

	public static void main(String[] args) {
		int []arr= {6,6,6,1,7,7,7,8,8,10,10};
		int key=8;
		
		int start=0;
		int end=arr.length-1;
		int s=start;
		int e=end;
		int temp1=0;
		int temp2=0;
		
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==key) {
				temp1=mid;
				temp2=lastIndex(arr,key,mid+1,e);//function call
				end=mid-1;
			}
			else if(arr[mid]>key)
				end=mid-1;
			else
				start=mid+1;
		}
		
		System.out.println(temp1+" "+temp2);

	}

	public static int lastIndex(int[]arr,int key,int start, int end)  {
		 while(start<=end) {
				int mid=(start+end)/2;
				if(arr[mid]==key) 
					return mid;
				else if(arr[mid]>key)
					end=mid-1;
				else
					start=mid+1;
			}
		 return -1;
	}
	

}
