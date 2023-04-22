package twoPointerApproach_EquiDirection_WindowSum;

public class TwoPointerApproach_EquiDirection_WindowSum {
	public static void main(String []args)
	{
		int []arr= {1,9,-1,-2,7,3,-1,2};
		int windowSize=2;
		int res=maxSubSum(arr,windowSize);
		System.out.println(res);
	}
	
	public static int maxSubSum(int []arr,int k)
	{
		int start=0,end=0;
		int windowSum=0,maxSum=0;
		while(end<k) {
			windowSum+=arr[end++];
		}
		while(end<arr.length)
		{
			windowSum+=arr[end++]-arr[start++];
			maxSum=Math.max(windowSum, maxSum);
		}
		return maxSum;
	}
}
