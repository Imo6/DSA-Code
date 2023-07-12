package subArraySum;

import java.util.Arrays;

//public class SubArrayMaxSum
//{
//	public static void main(String[] args) {
//		//int[] arr = {-1, -7, -3, -2,-5,-1,-8, -9};
//		int[]arr={1, -7, 3, -2, 5,-1, 8, -9};
//		int sum=0,fsum=0;
//		
//		for(int i=0; i<arr.length; i++)
//		{
//		    sum=0;
//		    for(int j=i; j<arr.length; j++)
//		    {
//		        sum += arr[j];
//		        
//		        if(j==0)
//		        {
//		            fsum = sum;
//		        }
//		        if(sum>fsum)
//		        {
//		            fsum = sum;
//		        }
//		    }
//		}
//		
//		System.out.println(fsum);
//	}
//}


/*Best Solutions among above as this code take only o(n) time Complexity*/
//return maxSum
public class SubArrayMaxSum
{
	public static void main(String[] args) {
		int[] arr = {-1, -7, -3, -2,-5,-1,-8, -9};
		//int[] arr = {3 ,-1, 6, -3, -4, 8, 2, 5};
		//int[]arr={1, -7, 3, -2, 5,-1, 8, -9};
		int len=arr.length;
		int maxOverall=arr[0];
		int maxInter=arr[0];
		for(int i=1;i<arr.length;i++) {
			maxInter=Math.max(maxInter+arr[i],arr[i]);
			maxOverall=Math.max(maxInter,maxOverall);
		}
		
		System.out.println(maxOverall);
	}
}



