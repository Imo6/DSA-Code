package subArraySum;

import java.util.*;

public class SubArrayGivenSum {

//	// Find subarray with the given sum targetSum
//	static List<Integer> subarrayWithGivenSum(List<Integer> arr, int targetSum)
//	{
//		int sum = 0;
//		Set<Integer> s = new HashSet<>();
//		for (int i = 0; i < arr.size(); i++) {
//			// Find the sum
//			sum += arr.get(i);
//			if (sum == targetSum) {
//				return arr.subList(0, i + 1);
//			}
//			if (s.contains(sum - targetSum)) {
//				int start= arr.indexOf(sum - targetSum) + 1;
//				return arr.subList(start, i + 1);
//			}
//			s.add(sum);
//		}
//		return new ArrayList<>();
//	}
//
//	// Driver Code
//	public static void main(String[] args)
//	{
//		List<Integer> arr= Arrays.asList(15, 2, 4, 8, 9, 5, 10, 23);
//		List<Integer> subarray= subarrayWithGivenSum(arr, 23);
//		if (subarray.isEmpty()) {
//			System.out.println(
//				"No subarray with given sum found");
//		}
//		else {
//			System.out.print("Subarray: [ ");
//			for (int i : subarray) {
//				System.out.print(i + " ");
//			}
//			System.out.println("]");
//		}
//	}
//}
	
	static void subArray(int[] arr, int sum)
	{
		for(int i=0;i<arr.length;i++)
		{
			int check=0;
			int j=i;
			while(j<arr.length && check<sum)
			{
				check+=arr[j++];
				
			}
			if(check==sum)
			{
				for(int k=i;k<j;k++)
					System.out.print(arr[k]+" ");
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {2,0,1,2,3,0,1,2};
		//int[] arr= {15, 2, 4, 8, 9, 5, 10, 23};
		int k=3;
		SubArrayGivenSum.subArray(arr,k);
	}

}


