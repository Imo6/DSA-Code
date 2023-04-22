
package subArraywithGivenSum;

public class SubArraywithGivenSum {
/*	public static void printSubarray(int []arr,int sum) {
		int left=0;
		int right=0;
		int tempSum=arr[0];
		
		while(right<arr.length)
		{
			if(tempSum==sum)
			{
				//function call
				printSubArray(arr,left,right);
			}
			else if(tempSum<sum)
			{
				right++;
				if(right<arr.length)
					tempSum+=arr[right];
				else
					break;
			}
			else
			{
				tempSum-=arr[left];
				left++;
			}
		}
	}
	public static void printSubArray(int []arr,int left,int right)
	{
		for(int i=left;i<=right;i++) {
			System.out.print(arr[left]+" ");
		}
	}
	*/
	public static void printSubarray(int[] arr, int targetSum) {
	    int left = 0;
	    int right = 0;
	    int currentSum = arr[0];

	    while (left < arr.length) {
	        if (currentSum == targetSum) {
	            printSubarray(arr, left, right);
	            return;
	        } else if (currentSum < targetSum) {
	            right++;
	            if (right < arr.length) {
	                currentSum += arr[right];
	            } else {
	                break;
	            }
	        } else {
	            currentSum -= arr[left];
	            left++;
	        }
	    }
	}

	public static void printSubarray(int[] arr, int left, int right) {
	    for (int i = left; i <= right; i++) {
	        System.out.print(arr[i] + " ");
	    }
	    System.out.println();
	}

	public static void main(String[] args) {
//		int []arr= {1,4,20,3,10,5};
//		SubArraywithGivenSum.printSubarray(arr,30);
		int []arr= {1,4,20,3,10,5};
		int targetSum = 30;
		SubArraywithGivenSum.printSubarray(arr, targetSum);
	}
}

