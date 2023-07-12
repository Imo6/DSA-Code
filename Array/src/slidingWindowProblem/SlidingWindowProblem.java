package slidingWindowProblem;

//T.C of this code is O(n)
public class SlidingWindowProblem {
	public static void main(String[] args)
	{
		  int []arr= {1,9,-1,-2,7,3,-1,2};
		  //int []arr= {2,4,-3,5,-1,10};
		int res=SlidingWindowProblem.maxSubSum(arr,4);
		System.out.println(res);
	}
	
	public static int maxSubSum(int []arr,int k)
	{
		int windowSum=0,maxSum=0;
		
		//this loop only for calculating window sum of first window size element==> 7 
		for(int i=0;i<k;i++)
		{
			windowSum+=arr[i];
		}
		
		for(int end=k;end<arr.length;end++)
		{
			windowSum+=arr[end]-arr[end-k];
			maxSum=Math.max(maxSum, windowSum);
		}
		return maxSum;
	}

}
