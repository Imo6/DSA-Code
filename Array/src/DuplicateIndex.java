
public class DuplicateIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {6,7,7,8,8,10,10};
		int key=8;
		int s=0;
		int e=arr.length-1;
		int mid=(s+e)/2;
		int[] newarr=new int[2];
		
		while(e>s) {
			if(arr[mid]==key) {
				break;
			}
			else if(arr[mid]<key)
				s=mid+1;
			else
				e=mid-1;
			mid=(s+e)/2;
		}
		System.out.println(mid);

	}

}
