
public class CheckArrayisSort {
	public static boolean check(int arr[])
	{
		
		for(int i=1;i<=arr.length-1;i++) {
			if(arr[i-1]>arr[i])
			   return false;
		}
		return true;
		
	}

	public static void main(String[] args) {
//		int []arr= {1,2,4,2,8,9,5,19};
		int []arr= {2,2,2,2,5};
	System.out.println(	CheckArrayisSort.check(arr));;

	}

}
