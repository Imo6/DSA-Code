package selectionSort;

import java.util.Arrays;

import BubbleSort.Sort;

public class SelectionSort {

	public static void main(String[] args) {
//		int []arr= {4,3,2,1};
		int []arr= {4,3,4,14,18,9,20,2,1};
		SelectionSort.fun(arr,arr.length,0,0);//last 0 is starting index
		System.out.println(Arrays.toString(arr));

	}
	public static void fun(int [] arr,int r,int c,int max ) {
		if(r==0)
			return ;
		if(r>c) {
			if(arr[c]>arr[max]) {
				fun(arr,r,c+1,c);
			}else {
				fun(arr,r,c+1,max);
			}
		}else {
			//swap
			int temp=arr[max];
			arr[max]=arr[r-1];
			arr[r-1]=temp;
			fun(arr,r-1,0,0);
		}
		
	}

}
