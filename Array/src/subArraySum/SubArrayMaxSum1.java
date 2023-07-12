package subArraySum;

import java.util.Arrays;

/*Best Solution as this code take o(n) time Complexity*/
public class SubArrayMaxSum1
{
	public static int[] SubMax(int []arr) {
		int len=arr.length;
		int maxOverall=arr[0];
		int maxInter=arr[0];
		int endIndex=0;
		for(int i=1;i<arr.length;i++) {
			maxInter=Math.max(maxInter+arr[i],arr[i]);
			if(maxInter>maxOverall) {
				maxOverall=Math.max(maxInter,maxOverall);
				endIndex=i;
			}
				
		}
		int startIndex=endIndex;
		while(startIndex>=0) {
			maxOverall-=arr[startIndex];
			if(maxOverall==0)
				break;
			startIndex--;
		}
		int[] res=Arrays.copyOfRange(arr, startIndex, endIndex+1);
		return res;
	}
	public static void main(String[] args) {
		//int[] arr = {-1, -7, -3, -2,-5,-1,-8, -9};
		//int[] arr = {3,-1,6,-3,-4,8,2,5};
		int[]arr={1, -7, 3, -2, 5,-1, 8, -9};
		
		int []result=SubArrayMaxSum1.SubMax(arr);
		for(int i:result)
			System.out.print(i+" ");
	}
}


