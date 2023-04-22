package twoPointerApproach_WindowSum;

import java.util.ArrayList;
import java.util.List;

//public class TwoPointerApproach_WindowSum {
//	public static void main(String[] args) {
//		int []arr= {-3,2,3,3,6,8,15};
//		int target=6;
//		TwoPointerApproach_WindowSum obj=new TwoPointerApproach_WindowSum();
//		int []arr1=obj.sum_SubArray(arr,target);
//		for(int ele:arr1)
//			System.out.print(ele+" ");
//		
//	}
//	
//	public int[] sum_SubArray(int []arr,int target)
//	{
//		int start=0,end=arr.length-1;
//		int windowsum=0;
//		int []resArray=new int[2];
//		
//		while(start<end) {
//			windowsum=arr[start]+arr[end];
//			if(windowsum==target) {
//				resArray[0]=start;
//				resArray[1]=end;
//				break;
//			}
//			else if(windowsum>target)
//				end--;
//			else
//				start++;	
//		}
//		return resArray;
//	}
//
//}



public class TwoPointerApproach_WindowSum {
	public static void main(String[] args) {
		int []arr= {-3,2,3,3,6,8,15};
		int target=6;
		TwoPointerApproach_WindowSum obj=new TwoPointerApproach_WindowSum();
		ArrayList arr1=obj.sum_SubArray(arr,target);
		System.out.println(arr1); 
	}
	
	public ArrayList sum_SubArray(int []arr,int target)
	{
		int start=0,end=arr.length-1;
		int windowsum=0;
		ArrayList list=new ArrayList();
		
		while(start<end) {
			windowsum=arr[start]+arr[end];
			if(windowsum==target) {
				list.add(start);
				list.add(end);
				break;
			}
			else if(windowsum>target)
				end--;
			else
				start++;	
		}
		return list;
	}

}
