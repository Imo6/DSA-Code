package BubbleSort;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
//		int []arr= {4,3,2,1};
		int []arr= {4,3,14,18,9,20,2,1};
		int r=arr.length-1;
		Sort.fun(arr,r,0);
		System.out.println(Arrays.toString(arr));

	}
	public static void fun(int []arr,int r,int c) {
		if(r==0)
			return;
		if(r>c) {
			if(arr[c]>arr[c+1]) {
				//swap
				int temp=arr[c];
				arr[c]=arr[c+1];
				arr[c+1]=temp;
			}
			fun(arr,r,c+1);
		}else {
			fun(arr,r-1,0);
		}
		
		
	}

}
