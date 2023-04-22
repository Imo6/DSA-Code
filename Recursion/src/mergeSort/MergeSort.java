package mergeSort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,3,7,8,1,9,10,4,5};
		arr=fun(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	public static int[] fun(int []arr) {
		if(arr.length==1)
			return arr;
		int mid=arr.length/2;
		int[] left=fun(Arrays.copyOfRange(arr, 0,mid));
		int []right=fun(Arrays.copyOfRange(arr, mid,arr.length));
		return funmerge(left,right);	
	}
	
	public static int[] funmerge(int[] first, int[] second) {
		int []mix=new int[first.length+second.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<first.length && j<second.length) {
			if(first[i]<second[j])
				mix[k++]=first[i++];
			else
				mix[k++]=second[j++];
				
		}
		while(i<first.length)
			mix[k++]=first[i++];
		while(j<second.length)
			mix[k++]=second[j++];
		return mix;
	}

}
